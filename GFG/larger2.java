public class larger2 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int larg = a[0];
        int secound = a[1];

        for (int i = 0 ; i<a.length ; i++)
        {
            if(a[i]>larg)
            {
                larg = a[i];
            }
        }
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i]<larg)
            {
                secound = a[i];
            }
        }System.out.println(secound);
    }
    
}
