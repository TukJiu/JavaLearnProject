import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("���������� �� �� ");
		int b = a.nextInt();
		switch(b) {
		case 1:
			System.out.println("��һȥ�ܲ�");
			break;
		case 2:
			System.out.println("�ܶ�������");
			break;
		case 3:
			System.out.println("�����θ�Ӿ");
			break;
		case 4:
			System.out.println("�����ﵥ��");
			break;
		case 5:
			System.out.println("�����ȭ��");
			break;
		case 6:
			System.out.println("����ȥ��ɽ");
			break;
		case 7:
			System.out.println("���ճ�һ��");
			break;
		default:
			System.out.println("�밴�ձ��ܾͽ�ԭ�����룡");
			break;
		}
	}
}
