import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder x = new StringBuilder(sc.next());
		System.out.println(x);
		for(int i=x.length()-1;i>=0;i--){
			System.out.println(x.deleteCharAt(i));
		}
	}

}
