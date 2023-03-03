public class star1 {
    public static void main(String[] args) {

        int a, b;

        for (a = 1; a <= 5; a++) {
            for (a = 1; a <= 5; a++) {
                for (b = a; b >= 1; b--) {
                    System.out.print(b);
                }
                System.out.println();
            }
        }
    }
}
