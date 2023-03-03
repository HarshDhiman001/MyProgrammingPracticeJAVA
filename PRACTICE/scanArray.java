public class scanArray {
    public static void main(String[] args) {
        int a[][][] = { { { 1, 2, 3, 6, 8, 9 }, { 4, 5, 6, 9, 6, 5 } }, { { 3, 2, 1, 4, 8, 5 }, { 6, 5, 4, 7, 9, 4 } },
                { { 1, 5, 3, 8, 6, 9 }, { 6, 7, 3, 8, 3, 1 } } };
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                for (int k = 0; k <= 5; k++) {
                    System.out.print(a[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
