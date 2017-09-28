import java.util.Scanner;

public class ListFix02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		int soma = 0;
		int count = 0;
		System.out.println("Digite números positivos e 0 para parar: ");
		while(n != 0){
			n = sc.nextInt();
			for(int i=1;i<n;i++)
				if(n%i == 0) count++;
			if(count == 1)
				soma+=n;
			count = 0;
		}
		System.out.println("A soma dos numeros primos é: " +soma);
	}

}
