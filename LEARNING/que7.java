public class que7 {
    public static void main(String[] args) {

        int a, b, c;
        for (a = 1; a <= 4; a++) {
            for (b = 5; b >= a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= a; c++) {
                if (a % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
        System.out.println(" 55555");
        System.out.println("@@@@@@");
    }
}
