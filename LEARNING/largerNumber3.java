public class largerNumber3 {
    public static void main(String[] args) {
        int a[] = { 13, 2, 33, 55, 93 };
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
