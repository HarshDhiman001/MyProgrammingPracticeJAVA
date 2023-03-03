public class largerNumber2 {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int m = 0;

        for (int i = 0; i <= 4; i++) {
            sum = a[i];
            System.out.println(sum);
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println("larger value in array");
        System.out.println(m);
    }
}
