import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("请输入一个三位的整数： ");
		int n = num.nextInt();
		if(n>999 || n<100) {
			System.out.println("位数不符合，请重新运行");
			return;
		}
		System.out.println("百位： "+n/100);
		System.out.println("十位： "+(n/10-(n/100)*10));
		System.out.println("个位： "+(n-(n/10)*10));
		num.close();
	}
}
