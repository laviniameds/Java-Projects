import java.util.Scanner;

public class ListFix08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, soma = 0, count = 0, i = 0, elevado = 0;
		System.out.println("Digite m: ");
		m = sc.nextInt();
		for (i=1; i<=m; i++){
			System.out.println("Os inteiros cuja soma é igual a " +i+ " ao cubo são:");
			elevado = (int)Math.pow(i, 3);
			
			System.out.println();
		}
	}

}
