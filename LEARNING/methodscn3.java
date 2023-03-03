import java.util.*;

public class methodscn3 {
    static void star(int d) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a = obj.nextInt();
        int b, c;
        for (b = 1; b <= a; b++) {
            for (c = a; c >= b; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(0);
    }
}
