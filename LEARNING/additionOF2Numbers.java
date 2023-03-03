public class additionOF2Numbers {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
            System.out.println();
            sum += a[i];

        }
        System.out.println("sum :");
        System.out.println(sum);

    }
}
