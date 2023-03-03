public class D2array2 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
