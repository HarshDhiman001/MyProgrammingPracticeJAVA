public class patter2same {
    public static void main(String[] args) {
        int a, b, c;
        for (a = 1; a <= 5; a++) {
            for (b = 4; b >= a; b--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (c = 2; c <= a; c++) {
                System.out.print("**");
            }
            System.out.println();
        }
        for (a = 1; a <= 4; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (c = 3; c >= a; c--) {
                System.out.print("**");
            }System.out.print("*");
            System.out.println();
        }
    }
}
