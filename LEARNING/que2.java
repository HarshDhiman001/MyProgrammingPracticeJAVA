import java.util.Scanner;

// take 2 values and print greater among them

public class que2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first value");
        int a = obj.nextInt();
        System.out.println("enter the secound value");
        int b = obj.nextInt();

        if (a < b) {
            System.out.println("the greater value is :" + b);
        } else if (a == b) {
            System.out.println("The values are equal " + a);
        } else {
            System.out.println("the greater value is :" + a);
        }
    }
}
