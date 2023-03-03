public class que5 {
    public static void main(String[] args) {

        int a, b;

        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= a; b++) {
                if (a % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
