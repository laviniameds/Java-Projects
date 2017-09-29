
public class Moeda {
	
	private double valor;
	
	public double getValor(){
		return valor;
	}
	
	public void setMoeda(int moeda){
		if(moeda == 50) 
			valor = 0.50;
		else
			valor = moeda;
	}
}
