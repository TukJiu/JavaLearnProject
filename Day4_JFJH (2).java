import java.util.Scanner;

public class B {
	public static void main(String[]args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��������_�� ");
		int b = a.nextInt();
		if(b>=1 && b<=5) {
			System.out.println("������");
		}else if(b==6 || b==7) {
			System.out.println("��Ϣ��");
		}else {
			System.out.println("������");
		}
	}
}
