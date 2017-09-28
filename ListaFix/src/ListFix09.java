import java.util.Scanner;

public class ListFix09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd, cobre, zinco;
		
		System.out.println("Digite a quantidade de latão em kg");
		qtd = sc.nextInt();
		cobre = (int)(qtd * 0.7);
		zinco = (int)(qtd * 0.3);
		
		System.out.println("A quantidade de cobre é aprox.: " + cobre + "kg");
		System.out.println("A quantidade de zinco é aprox.: " + zinco + "kg");
	}

}
