import java.util.Scanner;

public class Four{
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.print("����һ�����֣�");
		int o = p.nextInt();
		if(o%2 == 0) {
			System.out.println("���Ǹ�ż��");
		}else {
			System.out.println("���Ǹ�����");
		}
	}
}