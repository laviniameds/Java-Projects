public class Ponto {

	double x, y;
	
	public Ponto(){
		x = 0;
		y = 0;
	}
	
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void moverPara(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	
	public double distanciaOrigem(){
		double distancia;
		distancia = (double)Math.sqrt(x*x+y*y);
		return distancia;
	}
	
	public String toString(){
		return "Ponto("+x+","+y+")";
	}

}
