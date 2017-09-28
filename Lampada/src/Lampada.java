public class Lampada {
	
	private boolean ligada;
	private double potencia;
	
	public void ligar(){
		ligada = true;
	}
	
	public void desligar(){
		ligada = false;
	}
	
	public boolean estaLigada(){
		return ligada;
	}
	
}


