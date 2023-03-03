public class que9 {
    public static void main(String[] args) {
        int a, b, c, d, e;
        for (a = 1; a <= 2; a++) {
            for (b = 4; b >= a; b--) {
                System.out.print("-");
            }
            for (c = 1; c <= 1; c++) {
                System.out.print("/");
            }
            for (b = 2; b <= a; b++) {
                System.out.print("--");
            }
            for (d = 1; d <= 1; d++) {
                System.out.print("\\");
            }

            System.out.println();

        }
        for (e = 1; e <= 2; e++) {
            System.out.print("");
        }
    }
}
