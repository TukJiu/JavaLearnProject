import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("现在是星期 ？ ： ");
		int b = a.nextInt();
		switch(b) {
		case 1:
			System.out.println("周一去跑步");
			break;
		case 2:
			System.out.println("周二慢慢走");
			break;
		case 3:
			System.out.println("周三游个泳");
			break;
		case 4:
			System.out.println("周四骑单车");
			break;
		case 5:
			System.out.println("周五打拳击");
			break;
		case 6:
			System.out.println("周六去爬山");
			break;
		case 7:
			System.out.println("周日吃一顿");
			break;
		default:
			System.out.println("请按照本周就近原则输入！");
			break;
		}
	}
}
