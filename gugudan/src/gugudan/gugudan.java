package gugudan;
import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		int a =10;
		Scanner scan = new Scanner(System.in);
		System.out.printf("���ϴ� �ܼ��� �Է��ϼ��� :");
		a = scan.nextInt();
		if(a==0) {
			for(int i = 2;i <10; i++) {
				for(int j = 1;j<10;j++) {
					System.out.printf("%d * %d = %d  ",i,j,j*i);
				}
				System.out.printf("\n");
			}
		}
		else if(a<0) {
			System.out.print("������ ��� �Ұ�");
		}
		else {
			for(int i = 1;i<10;i++) {
				System.out.printf("%d * %d = %d\n",a,i,a*i);
			}
		}
	}
}
