import java.util.Scanner;

public class MethodDemo02 {
    static boolean isAlpha(Character r) {
        if ((r >= 'a' && r <= 'z') || (r >= 'A' && r <= 'Z'))
            return true;
        else
            return false;
    }

    static boolean isPrime(int t) {
        if (t % 2 == 0 || t % 3 == 0 || t % 5 == 0 || t % 7 == 0)
            return false;
        else
            return true;
    }

    static void O(String str) {
        System.out.println(str);
    }

    static void O(String str, boolean way) {
        if (way) {
            System.out.print(str);
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        O("程序开始运行");
        Scanner src = new Scanner(System.in);
        O("输入一个字符： ", true);
        if (isAlpha(src.next().charAt(0)))
            O("符合条件");
        else
            O("不符合条件");
        O("输入一个整数： ", true);
        if (isPrime(src.nextInt()))
            O("是质数");
        else
            O("不是质数");
        src.close();
        O("程序结束运行");
    }
}
