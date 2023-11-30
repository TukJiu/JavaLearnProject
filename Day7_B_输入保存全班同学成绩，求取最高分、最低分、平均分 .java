import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int times = 0;
		int max = 0;
		int min = -1;
		while(true) {
			System.out.print("输入Java成绩以进行数据运算： ");
			int t = input.nextInt();
			if(t<0) break;
			num += t;
			times++;
			if(t>max) max = t;
			if(t<min) min = t;
			if(min<0) min = t; //最小值初始化
			System.out.println("当前Java成绩最高分： "+max);
			System.out.println("当前Java成绩最低分： "+min);
			System.out.println("当前Java成绩平均值： "+num/times);
			System.out.println("这是第"+times+"个数据");
			System.out.println();
		}
		input.close();
	}
}
