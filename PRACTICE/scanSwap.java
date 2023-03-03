import java.util.Scanner;

public class scanSwap {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = swap.nextInt();
        System.out.println("enter the secound number");
        int b = swap.nextInt();
        System.out.println("enter the third number");
        int c = swap.nextInt();

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        int d = a;
        a=b;
        b=c;
        c=d;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

    }
}
