public class loop {
    public static void main(String[] args) {

        int a, b;
        int c = 0;
        for (a = 1; a <= 4; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(c +1);
                c++;
            }
            System.out.println();
        }
    }
}
