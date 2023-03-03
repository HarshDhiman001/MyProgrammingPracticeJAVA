class largerNumber1 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int m = 0;

        for (int i = 0; i <= 4; i++) 
        {
            sum = a[i];
            System.out.print(sum);
            System.out.print(" ");
            
            if (a[i] > m) {
                m = a[i];
            }
            
        }System.out.print(m);
    }
}
