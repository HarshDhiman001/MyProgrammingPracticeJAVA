public class reversNumber {
    public static void main(String[] args) {
        int num = 123456789;
        int r;

        do
        {
            r = num%10;
            System.out.print(r);
            num = num/10;
        }
        while(num>0);
    }
}
