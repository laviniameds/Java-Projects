
public class Maquina {
	
	private double credito;
	private double lucroTotal;
	private Moeda moeda;
	private Produto produtos[];
	
	public void receberCredito(int moedas){
		moeda.setMoeda(moedas);
		credito += moeda.getValor();
	}
	
	public Produto[] visualizarProdutos(){
		int c = 0;
		for(int i = 0; i<produtos.length;i++)
			if(produtos[i] != null)
				c++;
		Produto aux[] = new Produto[c];
		c = 0;
		for(int i = 0; i<produtos.length;i++)
			if(produtos[i] != null)
				aux[c++] = produtos[i];
		produtos = aux;
		return produtos;		
	}
	
	public double fazerCompra(int codigo){
		Produto p = selecionarProduto(codigo);
		if(p != null){
			double precoProduto = p.getPreco();
			if(credito >= precoProduto){
				lucroTotal += precoProduto;
				credito -= precoProduto;
				removerProduto(p);
				double troco = darTroco(precoProduto);
				credito = 0;
				return troco;
			}
			else return -2;
		}
		else return -2;
	}
	
	private void removerProduto(Produto p){
		for(int i=0;i<produtos.length;i++)
			if(produtos[i].getCodigo() == p.getCodigo()){
				produtos[i] = null;
				break;
			}
	}
	
	private Produto selecionarProduto(int codigo){
		for(int i=0;i<produtos.length;i++){
			if((produtos[i] != null) && (codigo == produtos[i].getCodigo())){
				return produtos[i];
			}
		}
		return null;
	}
	
	public double cancelarCompra(){
		return credito;
	}
	
	private double darTroco(double preco){
		if(lucroTotal >= credito)
			return credito;
		else return -1;		
	}
	
	public double visualizarCredito(){
		return credito;
	}
	
	public double visualizarLucroTotal(){
		return lucroTotal;
	}
	
	private void encherMaquina(){
		for(int i=0;i<30;i++){
			if(i < 10)
				produtos[i] = new Produto(1, "coca", 3.50);
			else if(i>9 && i <20)
				produtos[i] = new Produto(2, "guaraná", 2.50);
			else if(i>19 && i <30)
				produtos[i] = new Produto(3, "pepsi", 3.00);
		}
	}
	
	public Maquina(){
		produtos = new Produto[30];
		credito = 0;
		lucroTotal = 0;
		moeda = new Moeda();
		encherMaquina();
	}
	
}
