
public class Triangulo {

	private Ponto ponto1;
	private Ponto ponto2;
	private Ponto ponto3;
	
	public double getArea(){
		return getPerimetro()/2;
	}
	public double getPerimetro(){
		return ponto1.distancia1() + ponto2.distancia1() 
				+ ponto3.distancia1();
	}
}
