import java.util.Scanner;

class area_of_triangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter the height of a triangle");
        int height = triangle.nextInt();
        System.out.println("Enter the base of a triangle");
        int base = triangle.nextInt();

        int a = height * base;
        int area = a / 2;
        System.out.println("Area of a triangle :- " + area);
    }
}