public class star {
    public static void main(String[] args) {
        int a, b, c;

        for (a = 1; a <= 3; a++) 
        {
            for (b = 2; b >= a; b--) {
                System.out.print(" ");
            }
            for (c = 2; c <= a; c++) 
            {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
