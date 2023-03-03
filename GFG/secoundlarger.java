import java.util.*;
public class secoundlarger {
    public static void main(String[] args) {
        int arr []  = {12, 35, 1, 10, 34, 1};
        int larg = arr[0];
        int secound = arr[1];
        Arrays.sort(arr);
        for(int i = 0 ; i<=5 ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
