import java.util.Scanner;

public class method5 {
    static void star(int a) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int b = obj.nextInt();
        int c = b, d;
        for (c = 1; c <= b; c++) {
            for (d = 1; d <= c; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(0);
    }
}
