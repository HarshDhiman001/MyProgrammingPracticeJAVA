public class additionInMatrix {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 7, 8, 9, 10, 11, 12 };

        for (int i = 0; i <= 5; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (int j = 0; j <= 5; j++) {
            System.out.print(b[j]);
            System.out.print(" ");
        }
        System.out.println();
        int c = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+b[0]+b[1]+b[2]+b[3]+b[4]+b[5]);
        System.out.println(c);
    }

}
