import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("������һ����λ�������� ");
		int n = num.nextInt();
		if(n>999 || n<100) {
			System.out.println("λ�������ϣ�����������");
			return;
		}
		System.out.println("��λ�� "+n/100);
		System.out.println("ʮλ�� "+(n/10-(n/100)*10));
		System.out.println("��λ�� "+(n-(n/10)*10));
		num.close();
	}
}
