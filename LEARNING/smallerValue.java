public class smallerValue {
    public static void main(String[] args) {

        int a[] = { 2, 33, 1, 666, 453 };
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
