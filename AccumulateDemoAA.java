import java.util.Scanner;

public class AccumulateDemo02 {
	static int sum1(int n) {
		if(n<1)return -1;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += n;
		}
		return sum;
	}
	static double sum2(int n) {
		if(n<1) return -1.00;
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=(1/i);
		}
		return sum;
	}
	static double sum3(int n) {
		if(n<1) return -1.00;
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=(Math.pow(-1,i-1)/n);
		}
		return sum;
	}
	static void O(String str) {
		System.out.println(str);
	}
	static void O(String str, boolean way) {
//		if(way == null) way = false;
		if(way) {
			System.out.print(str);
		}else {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		O("程序开始运行");
		Scanner src = new Scanner(System.in);
		O("请输入sum1的n（1到n的和）： ",true);
		O(""+sum1(src.nextInt()));
		O("请输入sum2的n（倒数累加和）： ", true);
		O(""+sum2(src.nextInt()));
		O("请输入sum3的n（特殊累加和）：",true);
		O(""+sum3(src.nextInt()));
		src.close();
		O("程序运行结束");
	}
}
