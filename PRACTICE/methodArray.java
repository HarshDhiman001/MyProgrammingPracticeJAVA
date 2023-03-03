public class methodArray {
    static void arr(int b) {
        int a[] = { 1, 2, 3, 4, 5 };
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        arr(0);
    }
}
