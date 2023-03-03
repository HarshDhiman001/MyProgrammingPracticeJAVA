import java.util.Arrays;

class first{
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,2,3,5,3,2,3,52,2,9,2,0,10};

        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}