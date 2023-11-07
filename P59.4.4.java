import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner scores = new Scanner(System.in);
		System.out.print("输入得分： ");
		double s = scores.nextDouble();
		if(s>=80) {
			System.out.println("这是个A！");
		}
		if(s<80&&s>=60) {
			System.out.println("这是个B！");
		}
		if(s<60&&s>=20) {
			System.out.println("这是个C！");
		}
		if(s<20) {
			System.out.println("这位更是个寄！");
		}
		if(s>100||s<0) {
			System.out.println("这这这，这不对吧。我不打扰，我先走了哈~");
		}
	}
}
