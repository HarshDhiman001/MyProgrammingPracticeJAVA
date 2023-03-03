import java.util.Scanner;

public class methodScnStar {

    static void sum (int a)
        {
        int b = a;
        int c;
        for (b = 1; b <= a; b++) {
            for (c = 1; c <= b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a = obj.nextInt();
        sum(a);
    }

    
}
