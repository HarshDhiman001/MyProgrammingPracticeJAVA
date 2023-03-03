public class reverse2 {
    public static void main(String[] args) {
        int num = 1234567890;
        int r;
        while (num > 0) {
            r = num % 10;
            System.out.print(r+" ");
            num = num / 10;
        }

    }
}
