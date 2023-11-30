import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id[] = new int[10];
		System.out.println("请输入班级同学的"+id.length+"个学号，进行保存");
		for(int i = 0; i<id.length; i++) {
			System.out.print("请输入第"+(i+1)+"个学号： ");
			int temp = input.nextInt();
			for(int j = 0; j<i; j++) {
				if(id[j] == temp) {
					System.out.println("您输入的学号有重复，请重新输入当前学号");
					i--;
					continue;
				}
			}
			id[i] = temp;
		}
		System.out.println("请输入你要查找的学号");
		int inputForFind = input.nextInt();
		boolean f = false;
		for(int i = 0; i<id.length; i++) {
			if(id[i] == inputForFind) {
				System.out.println("您输入的学号存在，它的下标索引为： "+i);
				f = true;
				break;
			}
		}
		if(!f) {
			System.out.println("您输入的学号不存在");
		}
		input.close();
	}
}
