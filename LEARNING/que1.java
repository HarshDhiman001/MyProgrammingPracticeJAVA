import java.util.Scanner;

// Take value from user and check it is square or not?

public class que1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the Length");
        int a = obj.nextInt();
        System.out.println("enter the Breadth");
        int b = obj.nextInt();
        
        if(a==b)
        {
            System.out.println("It is a Square");
        }
        else{
            System.out.println("it is not a square");
        }
    }
    
}
