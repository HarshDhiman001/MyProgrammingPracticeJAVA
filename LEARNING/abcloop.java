public class abcloop {
    public static void main(String[] args) {
        char A, B;

        for (A = 'a'; A <= 'd'; A++) {
            for (B = 'a'; B <= A; B++) {
                System.out.print(B);
            }
            System.out.println();
        }
    }
}
