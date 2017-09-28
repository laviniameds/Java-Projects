import java.util.Scanner;

public class ListFix04 {
	public static void main(String[] args) {
		int n = -1, soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite numeros e 0 para parar: ");
		while(n != 0){
			n = sc.nextInt();
			if(n%2 == 0){
				soma += n;
			}
		}
		System.out.println("A soma dos pares são: " +soma);
	}

}
