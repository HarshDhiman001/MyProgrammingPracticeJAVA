public class ThirdLarg {
    public static void main(String[] args) {
        int a[] = { 11, 22, 33, 44, 55, 66 };
        int larg = a[0];
        int seclarg = a[1];
        int third = a[2];

        for (int i = 0; i <= 5; i++) {
            if (a[i] > larg) {
                larg = a[i];
            }
        }
        System.out.println(larg);
        for (int i = 0; i <= 5; i++) {
            if (a[i] < larg) {
                seclarg = a[i];
            }
        }
        System.out.println(seclarg);
        for (int i = 0; i <= 5; i++) {
            if (a[i] < seclarg) {
                third = a[i];
            }
        }
        System.out.println(third);
    }
}
