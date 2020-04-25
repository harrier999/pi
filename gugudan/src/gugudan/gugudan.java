package gugudan;
import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		int a =10;
		Scanner scan = new Scanner(System.in);
		System.out.printf("원하는 단수를 입력하세요 :");
		a = scan.nextInt();
		for(int i = 0;i<10;i++) {
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}
		
		
		
	}

}
