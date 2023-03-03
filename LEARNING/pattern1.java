public class pattern1 {
    public static void main(String[] args) {
        int a, b, c;

        for (a = 1; a <= 6; a++) {
            for (b = 5; b >= a; b--) {
                System.out.print("*");
            }
            System.out.print("*");
            for (c = 2; c <= a; c++) {
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println();
        }
    }

}
