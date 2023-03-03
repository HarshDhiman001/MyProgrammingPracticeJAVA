import java.util.Scanner;

public class patterWithMethodScn {
    static void patter (int a)
    {
        int b=a;
        int c;

        for(b=1; b<=a ; b++)
        {
            for(c=1 ; c<=b ; c++)
            {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number of rows");
        int a = obj.nextInt();
        patter(a);
        
    }
}
