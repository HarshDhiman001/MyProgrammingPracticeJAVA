public class que6 {
    public static void main(String[] args) {

        int a, b, c;
        for (a = 1; a <= 5; a++) {
            for (b = 4; b >= a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= a; c++) {
                if (a % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
