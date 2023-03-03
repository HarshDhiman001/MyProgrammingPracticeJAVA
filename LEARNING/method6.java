import java.util.Scanner;

public class method6 {
    static void sum(int a)
    {
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter the first number");
        int b = sum.nextInt();
        System.out.println("Enter the secound number");
        int c = sum.nextInt();
        int d = b+c;
        System.out.println("sum : "+ d);
    }
    public static void main(String[] args)
    {
        sum(0);    
    }
}
