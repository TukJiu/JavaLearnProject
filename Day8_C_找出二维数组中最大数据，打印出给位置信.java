
public class C {
	public static void main(String[] args) {
		int a[][]={{8,4,3,7},{5,3,4,2,8},{9,6,1,8,7,4}};
		int max = a[0][0];
		int maxI = 0;
		int maxJ = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		System.out.println("最大值是"+max+"，它在第"+(maxI+1)+"行，第"+(maxJ+1)+"列");
	}
}
