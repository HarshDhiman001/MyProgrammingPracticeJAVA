public class revers3 {
    public static void main(String[] args) {
        int a = 1237662361;
        int c;

        while(a>0)
        {
            c=a%10;
            System.out.println(c);
            a = a/10;
        }

    }
}
