import java.util.Scanner;

public class ListFix03 {
	public static void main(String[] args) {
		int n, count = 1, limite = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		System.out.println("Os " +n+ " primeiros ímpares são: ");
		while(limite < n){
			if(count%2 != 0){
				System.out.println(count);
				limite++;
			}
			count++;
		}
	}
}
