import java.util.Scanner;

public class ListaFix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n;
		System.out.println("Digite a base: ");
		x = sc.nextInt();
		System.out.println("Digite o expoente: ");
		n = sc.nextInt();
		while(n < 0){
			System.out.println("O expoente é menor que 0! Digite outro. ");
			n = sc.nextInt();
		}
		System.out.println("O resultado é: " + potencia(x, n));
	}
	public static int potencia(int x, int n){
		int pot = 1;
		for(int i=0;i<n;i++)
			pot *= x;
		return pot;
	}

}
