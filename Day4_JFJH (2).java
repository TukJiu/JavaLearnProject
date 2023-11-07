import java.util.Scanner;

public class B {
	public static void main(String[]args) {
		Scanner a = new Scanner(System.in);
		System.out.print("今天星期_： ");
		int b = a.nextInt();
		if(b>=1 && b<=5) {
			System.out.println("工作日");
		}else if(b==6 || b==7) {
			System.out.println("休息日");
		}else {
			System.out.println("超量！");
		}
	}
}
