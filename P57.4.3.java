import java.util.Scanner;

public class Four{
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.print("输入一个数字：");
		int o = p.nextInt();
		if(o%2 == 0) {
			System.out.println("这是个偶数");
		}else {
			System.out.println("这是个奇数");
		}
	}
}