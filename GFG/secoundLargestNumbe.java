public class secoundLargestNumbe {
    public static void main(String[] args) {
        int a[] = { 1, 33, 44, 5, 6 };
        int larg = a[0];
        int secoundLarg = a[1];

        for (int i = 0; i <= 4; i++) {
            if (a[i] > larg) {
                larg = a[i];
            }
        }
        System.out.print("First Largest Number = " +larg);
        System.out.println(" ");
        for (int i = 0; i <= 4; i++) {
            if (larg > a[1]) {
                secoundLarg = a[1];
            }
        }
        System.out.print("Secound Largest Number = " +secoundLarg);
    }
}
