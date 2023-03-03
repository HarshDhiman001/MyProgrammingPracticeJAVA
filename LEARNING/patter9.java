public class patter9 {
    public static void main(String[] args) {
        
        int a ,b,c;

        for(a=1;a<=5;a++)
        {
            for(b=1 ; b<=a ; b++)
            {
                System.out.print(" ");
            }
            for(c=5 ; c>=a ; c--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
