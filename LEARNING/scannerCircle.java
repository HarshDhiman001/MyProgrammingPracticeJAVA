import java.util.Scanner;

public class scannerCircle {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the radoius of a circle");
        int radious = obj.nextInt();

        int a = radious * radious;

        float pi = 3.14f;

        float area = a * pi;

        System.out.println("Area of a circle = " + area);
    }
}
