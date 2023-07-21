public class Arrays {
    public static void main(String[] args) {
        // single dimension array
        int a[] = new int[5];
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        // System.out.println(a1.clone());
        for (int i = 0; i < a.length; i++) {
            a[i] = i * i;

        }
        for (int i : a) {

            System.out.println(i);
        }
        // multi dimension
        // int a[][] = new int[5][3];
        // int[][] a1 = {{1,12,3},{11,112,221},{1,2,3},{12,12,322},{112,21,22}};
        // int[][] a2 = new int[5][3];
        // System.out.println(a.length);
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 3; j++) {
        // // System.out.println(a[i][j]);
        // a[i][j] = i * j;
        // System.out.println(a[i][j]);
        // System.out.println(a1[i][j]);
        // System.out.println(a1.length);

        // }
        // }

    }
}
