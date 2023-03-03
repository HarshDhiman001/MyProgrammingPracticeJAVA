public class methodrevers {
    static void revers(int a)
    {
        int num = 987654321;
        int r;
        while(num>0)
        {
            r = num%10;
            System.out.println(r);
            num = num/10;
        }
    }
    public static void main(String[] args) 
    {
        revers(0);    
    }
}
