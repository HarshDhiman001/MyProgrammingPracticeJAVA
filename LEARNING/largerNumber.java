public class largerNumber {
    public static void main(String[] args) {
        int a[] = { 10, 8, 40, 5, 2 };
        int sum = 0;
        int m = 0;
        for (int i = 0; i <= 4; i++) 
        {
            sum = a[i];
            System.out.println(sum);
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(" ");
        System.out.println(m);
    }
}
