import java.util.Scanner;

public class methodPattern {
    static void pattern(int d) {
        Scanner star = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = star.nextInt();
        int b, c;

        for (b = 1; b <= a; b++) {
            for (c = 1; c <= b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(0);
    }
}
