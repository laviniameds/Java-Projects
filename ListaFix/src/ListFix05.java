import java.util.Scanner;

public class ListFix05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n, limite = 0, c = 1;		
		System.out.println("Digite dois números diferentes de 0: ");
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println("Digite n: ");
		n = sc.nextInt();
		System.out.println("O multiplos desses numeros sao: ");
		while(limite < n){
			if(c%i == 0 || c%j == 0){
				System.out.println(c);
				limite++;
			}
			c++;
		}
	}

}
