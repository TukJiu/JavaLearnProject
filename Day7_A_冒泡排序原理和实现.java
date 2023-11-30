
public class A {
	public static void main(String[] args) {
	int[] a = {5,8,14,15,61,63,64,65,9,6,3,4};
	for(int i = 0; i < a.length-1; i++) {
		for(int j = 0; j < a.length-i-1; j++) {
			if(a[j] >= a[j+1]) {
				int temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
			}
		}
	}
	}
}
