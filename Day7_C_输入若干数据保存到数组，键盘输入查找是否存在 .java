import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id[] = new int[10];
		System.out.println("������༶ͬѧ��"+id.length+"��ѧ�ţ����б���");
		for(int i = 0; i<id.length; i++) {
			System.out.print("�������"+(i+1)+"��ѧ�ţ� ");
			int temp = input.nextInt();
			for(int j = 0; j<i; j++) {
				if(id[j] == temp) {
					System.out.println("�������ѧ�����ظ������������뵱ǰѧ��");
					i--;
					continue;
				}
			}
			id[i] = temp;
		}
		System.out.println("��������Ҫ���ҵ�ѧ��");
		int inputForFind = input.nextInt();
		boolean f = false;
		for(int i = 0; i<id.length; i++) {
			if(id[i] == inputForFind) {
				System.out.println("�������ѧ�Ŵ��ڣ������±�����Ϊ�� "+i);
				f = true;
				break;
			}
		}
		if(!f) {
			System.out.println("�������ѧ�Ų�����");
		}
		input.close();
	}
}
