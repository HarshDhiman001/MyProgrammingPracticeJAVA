import java.util.Scanner;

public class whilescn {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number");
        int a = obj.nextInt();
        int b = 1;
        System.out.println("ans");
        while (b <= 10) {
            System.out.println(a + " x " + b + " = " + a * b);
            b++;

        }
    }
}
