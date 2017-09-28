
public class Ponto {

	private int x, y;
	
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setX(int x){
		this.x = x;
	}
	public double hipotenusa(){
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(),2));
	}
	
	public double hipotenusa2(Ponto q){
		double aux1 = getX() - q.getX();
		double aux2 = getY() - q.getY();
		double cat1 = Math.pow(aux1, 2);
		double cat2 = Math.pow(aux2, 2);;
		return Math.sqrt(cat1 + cat2);
	}
}
