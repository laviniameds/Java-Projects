import java.util.Scanner;

public class Main {
	
	public static void Menu(){
		System.out.println("1 - Inserir Moedas\n2 - Fazer Compra\n" +
				"3 - Visualizar Credito\n4 - Visualizar Produtos\n" +
				"5 -  Visualizar Lucro Total\n0 - Cancelar Compra");
	}
	
	public static void ListarProdutos(Produto produtos[]){
		for(int i = 0;i<produtos.length;i++){
			System.out.println(produtos[i].getCodigo()+ " - " 
		+produtos[i].getDescricao()+ " - " +produtos[i].getPreco());
		}
	}
	
	public static void fazerCompra(double troco){
		if(troco == 0)
			System.out.println("Houve um erro na compra! Produto não encontrado ou " +
					"crédito inferior ao valor do produto selecionado");
		else if(troco == -1)
			System.out.println("Compra realizada com sucesso! " +
					"No momento estamos sem troco disponível. Volte Sempre.");
		else
			System.out.println("Compra realizada com sucesso! Seu troco é: R$ " + troco);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maquina maquina = new Maquina();
		
		Menu();
		int op = sc.nextInt();
		
		while(op != 0){
			switch (op) {
			case 1:
				System.out.println("Digite '50' para moedas de 50 centavos," +
						"\n'1' para moedas de 1 real e \n'0' para parar");
				int moeda = sc.nextInt();
				while(moeda != 0){
					maquina.receberCredito(moeda);
					moeda = sc.nextInt();
				}
				break;

			case 2:
				ListarProdutos(maquina.visualizarProdutos());
				System.out.println("Digite o codigo do produto que voce quer: ");
				fazerCompra(maquina.fazerCompra(sc.nextInt()));
				break;
				
			case 3:
				System.out.println("Seu crédito é de R$ " +maquina.visualizarCredito());
				break;

			case 4:
				ListarProdutos(maquina.visualizarProdutos());
				break;
				
			case 5:
				System.out.println("Lucro Total: " + maquina.visualizarLucroTotal());
				break;
			
			case 0:
				break;
				
			default:
				break;
			}
		}

	}

}
