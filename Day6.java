import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner A = new Scanner("请依次输入被运算数、运算符号、运算数： ");
        int numA = A.nextInt();
        String strC = A.next();
        int numB = A.nextInt();
        switch (strC) {
            case "+":
                System.out.println(numA + "+" + numB + "=" + (numA + numB));
                break;
            case "-":
                System.out.println(numA + "-" + numB + "=" + (numA - numB));
                break;
            case "*":
                System.out.println(numA + "*" + numB + "=" + (numA * numB));
                break;
            case "/":
                System.out.println(numA + "/" + numB + "=" + (numA / numB));
                break;
            default:
                System.out.println("运算符不符合四则运算");
                break;
        }
        double sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += 1 / (i + 1);
        }
        System.out.println(sum);
        int classNum = 0;
        while (classNum <= 30 || classNum >= 50) {
            System.out.print("请输入班级人数（30~50）: ");
            classNum = A.nextInt();
        }
        System.out.println("班级人数为" + classNum);
        System.out.println("请输入一个整数");
        int aNum = A.nextInt();
        while (aNum / 10 != 0) {
            System.out.println(aNum - aNum / 10 * 10);
            aNum = aNum / 10;
        }
        System.out.println(aNum - aNum / 10 * 10);
        A.close();
    }
}