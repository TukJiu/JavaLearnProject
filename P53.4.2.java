import java.util.Scanner;

public class Tow {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.print("请输入给定的华氏度： ");
		double t = num.nextDouble();
		System.out.println("转换为摄氏度："+5*(t-32)/9);
		num.close();
		
	}
}
