public class reverseNumber1 {
    public static void main(String[] args) {
        int num = 987654321;
        int r ;
        while(num>0)
        {
            r = num%10;
            System.out.println(r);
            num = num/10;
        }


    }
}
