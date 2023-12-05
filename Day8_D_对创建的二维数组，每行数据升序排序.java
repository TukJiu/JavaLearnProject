public class D {
	public static void main(String[] args) {
		int a[][]={{8,4,3,7},{5,3,4,2,8},{9,6,1,8,7,4}};
		for(int i = 0; i<a.length; i++) {
			a[i] = S.sort(a[i]);
		}
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

class S{
	static int[] sort(int[] r){
		for(int i = r.length; i>0; i--) {
			for(int j = 0; j<i-1; j++) {
				if(r[j]>r[j+1]) {
					int temp = r[j+1];
					r[j+1] = r[j];
					r[j] = temp;
				}
			}
		}
		return r;
	}
}
