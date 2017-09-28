
public class Agenda {

	private Contato contatos[];
	
	public boolean addContato(Contato c){
		for(int i=0;i<contatos.length;i++){
			if(contatos[i] == null){
				contatos[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public void definirTamanho(int t){
		contatos = new Contato[t];
	}
	
	public void setTamanho(int t){
		Contato aux[] = contatos;
		contatos = new Contato[t];
		if(aux != null){
			for(int i=0;i<aux.length;i++){
				contatos[i] = aux[i];
			}
		}
	}
	
	public int getTamanho(){
		return contatos.length;
	}
	
	public Contato buscarContato(String nome){
		for(int i=0;i<contatos.length;i++){
			if(nome.equalsIgnoreCase(nome)) return contatos[i];
		}
		return null;
	}
	
	public boolean removerContato(String nome){
		for(int i=0;i<contatos.length;i++){
			if(nome.equalsIgnoreCase(nome)){
				contatos[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Contato[] listarContatos(){
		return contatos;
	}
	
	public boolean estaLotada(){
		for(int i=0;i<contatos.length;i++)
			if(contatos[i] == null) 
				return false;
		return true;
	}

}
