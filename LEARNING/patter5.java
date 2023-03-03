public class patter5 {
    public static void main(String[] args) {
        int a, b, c;

        for (a = 1; a <= 5; a++) {
            for (b = 2; b <= a; b++) {
                System.out.print(" ");
            }
            for (c = 5; c >= a; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (a = 1; a <= 5; a++) {
            for (b = 4; b <= 4; b++) {
                System.out.print("    ");
            }
            for (c = 2; c <= a; c++) {
                System.out.print("*");
            }
            System.out.print("**");
            System.out.println();
        }
    }
}
