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
		O("����ʼ����");
		Scanner src = new Scanner(System.in);
		O("������sum1��n��1��n�ĺͣ��� ",true);
		O(""+sum1(src.nextInt()));
		O("������sum2��n�������ۼӺͣ��� ", true);
		O(""+sum2(src.nextInt()));
		O("������sum3��n�������ۼӺͣ���",true);
		O(""+sum3(src.nextInt()));
		src.close();
		O("�������н���");
	}
}
