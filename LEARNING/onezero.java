public class onezero {
    public static void main(String[] args) {

        int a, b;

        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= a; b++) {
                if (b%2==0) 
                {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
