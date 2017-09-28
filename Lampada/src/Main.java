public class Main {

	public static void main(String[] args) {
		Ponto p = new Ponto();
		Ponto p2 = new Ponto();
		p.setX(5);
		p.setY(7);
		p2.setX(2);
		p2.setY(3);
		
		System.out.println("X: " +p.getX()+ "\nY: " +p.getY());
		System.out.println("Hipotenusa: " +p.hipotenusa());
		System.out.println("Hipotenusa: " +p.hipotenusa2(p2));
	}

}
