package gugudan;
import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		int a =10;
		Scanner scan = new Scanner(System.in);
		System.out.printf("���ϴ� �ܼ��� �Է��ϼ��� :");
		a = scan.nextInt();
		for(int i = 0;i<10;i++) {
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}
		
		
		
	}

}
