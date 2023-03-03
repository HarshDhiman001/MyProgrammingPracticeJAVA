import java.util.Scanner;
public class methodscanner {
    static void sum(int c)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number");
        int a = obj.nextInt();
        System.out.println("enter the secound number");
        int b = obj.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        sum(0);
        
    }
}
