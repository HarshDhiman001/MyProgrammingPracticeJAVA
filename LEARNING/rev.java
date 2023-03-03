public class rev {
    public static void main(String[] args) {
        int a, b;

        for (a = 1; a <=4; a++) {
            for (b = 4; b >= a; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
