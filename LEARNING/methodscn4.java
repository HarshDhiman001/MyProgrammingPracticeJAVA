import java.util.Scanner;

public class methodscn4 {
    static void call(int d) {
        Scanner star = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int e = star.nextInt();
        int a, b, c;

        for (a = 1; a <= e; a++) {
            for (b = a - 1; b >= 1; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= e; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        call(0);
    }
}
