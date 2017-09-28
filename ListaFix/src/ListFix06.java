import java.util.Scanner;

public class ListFix06 {

	public static void main(String[] args) {
		int n;
		boolean isTriangular = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um inteiro positivo: ");
		n = sc.nextInt();
		for(int i = 2; i<n; i++){
			if((i-1)*i*(i+1) == n)
				isTriangular = true;
		}
		if(isTriangular)
			System.out.println(n + " é triangular");
		else 
			System.out.println(n + " não é triangular");
	}

}
