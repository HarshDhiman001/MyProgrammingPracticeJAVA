public class que8 {
    public static void main(String[] args) {

        int a, b, c, d, e;
        for (a = 7; a <= 7; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print("_ ");
            }
            System.out.println();
        }
        for (a = 1; a <= 7; a++) {
            for (b = 2; b <= a; b++) {
                System.out.print(" ");
            }
            for (c = 1; c <= 1; c++) {
                System.out.print("\\");
            }
            for (d = 6; d >= a; d--) {
                System.out.print("  ");
            }
            for (e = 1; e <= 1; e++) {
                System.out.print("/");
            }
            System.out.println();

        }
    }
}
