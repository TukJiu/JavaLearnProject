import java.util.Scanner;

public class Tow {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.print("����������Ļ��϶ȣ� ");
		double t = num.nextDouble();
		System.out.println("ת��Ϊ���϶ȣ�"+5*(t-32)/9);
		num.close();
		
	}
}
