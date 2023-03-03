import java.util.Scanner;

public class starmathodscan {
    static void star (int a)
    {
        int c , d ;
        for (c=1 ; c<= a ; c++)
        {
            for (d=1 ; d<=c ; d++)
            {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner star = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a = star.nextInt();
        star(a);
        star.close();

        
    }
}
