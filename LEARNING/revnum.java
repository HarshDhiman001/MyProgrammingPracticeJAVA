public class revnum {
    public static void main(String[] args) {

        int a, b;

        for (a = 1; a <= 5; a++) {
            for (b = 5; b >= a; b--) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
