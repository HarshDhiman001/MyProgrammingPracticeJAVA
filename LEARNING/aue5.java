public class aue5 {
    public static void main(String[] args) {

        int a, b;
        int c = 0;

        for (a = 1; a <= 8; a++) {
            for (b = 7; b >= a; b--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (c = 2; c <= a; c++) {
                System.out.print("**");

            }
            System.out.println();
        }
        for (a = 1; a <= 7; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (c = 6; c >= a; c--) {
                System.out.print("**");
            }
            System.out.println();
        }
    }

}
