import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("�������ţ� ");
		int b = a.nextInt();
		switch(b) {
		case 1:
			System.out.println("��Ʊ��ѯ");
			break;
		case 2:
			System.out.println("��ƱԤ��");
			break;
		case 3:
			System.out.println("��Ʊ��ǩ");
			break;
		default:
			System.out.println("�˳�����");
		}
	}
}
