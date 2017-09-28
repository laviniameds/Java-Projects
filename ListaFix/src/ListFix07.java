import java.util.Scanner;

public class ListFix07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, MDC = 1, count = 0, x;
		System.out.println("Digite dois numeros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		for(int i=1;i<n1 || i<n2;i++){
			if(n1%i==0 && n2%i==0){
				for(x=1;x<i;x++)
					if(i%x == 0) 
						count++;
				if(count == 1){
					MDC*=i;
					n1 = n1/i;
					n2 = n2/i;
					i--;
				}
				count = 0;
			}
		}
		System.out.println("O MDC é: " +MDC);


	}

}
