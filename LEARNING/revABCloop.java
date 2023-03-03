public class revABCloop {
    public static void main(String[] args) {
        char a, b;

        for (a = 'A'; a <= 'D'; a++) {
            for (b = 'D'; b >= a; b--) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
