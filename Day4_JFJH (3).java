import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("输入服务号： ");
		int b = a.nextInt();
		switch(b) {
		case 1:
			System.out.println("机票查询");
			break;
		case 2:
			System.out.println("机票预定");
			break;
		case 3:
			System.out.println("机票改签");
			break;
		default:
			System.out.println("退出服务");
		}
	}
}
