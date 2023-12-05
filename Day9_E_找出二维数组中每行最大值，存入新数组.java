
public class E {
	public static void main(String[] args) {
		int a[][]={{8,4,3,7},{5,3,4,2,8},{9,6,1,8,7,4}};
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			int max = a[i][0];
			for(int j = 0; j<a[i].length; j++) {
				if(a[i][j]>max) max = a[i][j];
			}
			b[i] = max;
		}
		for(int i = 0; i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
	}
}
