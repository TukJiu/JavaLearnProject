import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner scores = new Scanner(System.in);
		System.out.print("����÷֣� ");
		double s = scores.nextDouble();
		if(s>=80) {
			System.out.println("���Ǹ�A��");
		}
		if(s<80&&s>=60) {
			System.out.println("���Ǹ�B��");
		}
		if(s<60&&s>=20) {
			System.out.println("���Ǹ�C��");
		}
		if(s<20) {
			System.out.println("��λ���Ǹ��ģ�");
		}
		if(s>100||s<0) {
			System.out.println("�����⣬�ⲻ�԰ɡ��Ҳ����ţ��������˹�~");
		}
	}
}
