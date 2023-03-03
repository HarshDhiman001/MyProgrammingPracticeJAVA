public class additionOf2Matrix {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
        int sum = 0;

        System.out.println("First Matrix");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Secound Matrix");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Addition ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                sum = a[i][j] + b[i][j];
                System.out.print(sum);
                System.out.print(" ");
            }System.out.println();
        }
    }
}
