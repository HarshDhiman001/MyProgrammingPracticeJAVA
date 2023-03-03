import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("Enter the Radius of a circle");
        int r = circle.nextInt();
        int Radius = r*r;
        System.out.println("Area of a circle :- ");
        float pi = 3.14f;
        float area = pi * Radius;
        System.out.println(area);
    }
}
