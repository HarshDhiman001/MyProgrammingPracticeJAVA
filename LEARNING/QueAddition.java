public class QueAddition {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int c[][] = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("  ");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("  ");
        System.out.println("Sum Of Two Matrix");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(" ");
                System.out.print(c[i][j]);
            }
            System.out.println();

        }
        // for (int i = 0; i <= 2; i++) {
        // for (int j = 0; j <= 2; j++) {
        // System.out.print(c[i][j]);
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
    }
}
