public class que1 {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        
        }
        System.out.println("  ");
        for (int i = 0; i <= 4; i++) {
            sum += sum + a[i];
        }
        System.out.println(sum);

    }
}
