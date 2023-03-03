public class mathod {
    public static void main(String[] args) {

        int a, b, c, d, e;

        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= a - 1; b++) {

                System.out.print(" ");
            }
            for (c = 1; c <= 1; c++) {
                System.out.print("X");
            }
            for (d = 4; d >= a + 1; d--) {
                System.out.print("  ");
            }
            System.out.print(" ");
            for (e = 1; e <= 1; e++) {
                System.out.print("X");
            }
            System.out.println();

        }
    }

}
