import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int times = 0;
		int max = 0;
		int min = -1;
		while(true) {
			System.out.print("����Java�ɼ��Խ����������㣺 ");
			int t = input.nextInt();
			if(t<0) break;
			num += t;
			times++;
			if(t>max) max = t;
			if(t<min) min = t;
			if(min<0) min = t; //��Сֵ��ʼ��
			System.out.println("��ǰJava�ɼ���߷֣� "+max);
			System.out.println("��ǰJava�ɼ���ͷ֣� "+min);
			System.out.println("��ǰJava�ɼ�ƽ��ֵ�� "+num/times);
			System.out.println("���ǵ�"+times+"������");
			System.out.println();
		}
		input.close();
	}
}
