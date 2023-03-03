import java.util.Scanner;

public class dowhiletablescn {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a first number");
        int a = obj.nextInt();
        System.out.println("enter the secound number");
        int b = obj.nextInt();

        System.out.println("ans :- ");

        while (b <= 10) {
            System.out.println(a + " X " + b + "= " + a * b);
            b++;
        }
    }
}
