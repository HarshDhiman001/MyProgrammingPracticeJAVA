import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the First Number");
        int a = obj.nextInt();
        System.out.println("enter the Secound Number");
        int b = obj.nextInt();
        System.out.println("enter the Operation");
        char c = obj.next().charAt(0);
        System.out.println("ans");

        switch (c) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
        }
    }
}
