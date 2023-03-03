import java.util.Scanner;

public class methodscn2 {
    static void hello(int a)
    {
        Scanner harsh = new Scanner(System.in);
        System.out.println("enter the first mumber");
        int b = harsh.nextInt();
        System.out.println("enter the secound number");
        int c = harsh.nextInt();
        System.out.println(b*c);
    }
    public static void main(String[] args)
    {
        hello(0);    
    }
}
