import java.util.Scanner;

public class scannerTriangle {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the base value");
        int base = obj.nextInt();
        System.out.println("enter the height of a triangle");
        int height = obj.nextInt();

        int a = base * height;
        int area = a / 2;

        System.out.println("Area of a triangle is = " + area);

    }
}
