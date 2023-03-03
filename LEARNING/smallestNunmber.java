import javax.sql.rowset.spi.SyncResolver;

public class smallestNunmber {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int m = a[0];
        for (int i = 0; i <= 4; i++) {
            
            if (a[i]>m) {
                m=a[i];
            }
                System.out.println(m);
            }
        }
    }

