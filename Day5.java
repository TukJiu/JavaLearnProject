import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 100) {
            sum += (i + 1);
            i++;
        }
        System.out.println(sum);

        for (int p = 1; p < 10; p++) {
            for (int j = p; j < 10; j++) {
                System.out.print(p + "*" + j + "=" + p * j + "\t");
            }
            System.out.println();
        }

        int Ipt_i = 0;
        int Ipt_t = 0;
        Scanner Ipt = new Scanner(System.in);
        while (true) {
            System.out.print("输入数字开始运算平均值： ");
            int Ipts = Ipt.nextInt();
            Ipt_i += 1;
            System.out.println("当前均值： " + (Ipts + Ipt_t) / Ipt_i);
            Ipt_t = Ipts + Ipt_t;
        }
    }
}