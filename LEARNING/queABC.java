public class queABC {
    public static void main(String[] args) {
        char a[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
        char b[][] = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' } };
        char c[][] = new char[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(" ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Addition of to matixs");
        System.out.println(" ");
        for(int i = 0 ; i <= 0 ; i++)
        {
            for(int j=0 ; j<=2 ; j++)
            {
                // c[i][j] = a[i][b]+b[i][j];

                System.out.print(c[i][j]);
                System.out.println(a[i][j]+b[i][j]);
                System.out.print(" ");
            }System.out.println();
        }
    }
}
