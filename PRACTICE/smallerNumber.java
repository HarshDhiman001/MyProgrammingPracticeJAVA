public class smallerNumber {
    public static void main(String[] args) {

        int a[] = { 11, 2, 3, 44, 55, 66 };
        int min = a[0];

        for (int i = 0; i <= 5; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
