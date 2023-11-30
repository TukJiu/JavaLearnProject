import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字符串： ");
		String t = input.next();
		char[] y = t.toCharArray();
		for(int i = y.length-1; i>=0; i--) {
			System.out.print(y[i]);
		}
		input.close();
	}
}
