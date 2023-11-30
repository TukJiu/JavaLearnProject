public class E {
    public static void main(String[] args) {
        int[] a = {1,3,3,3,4,5,5,7,7,3,5,0,0,5};
        int[] b = new int[a.length];
        int bi = 0;
        o:for(int i = 0; i < a.length; i++) {
            for(int j = 0; j<b.length; j++) {
                if(b[j]==a[i]) continue o;
            }
            b[bi] = a[i];
            bi++;
        }
    }
}