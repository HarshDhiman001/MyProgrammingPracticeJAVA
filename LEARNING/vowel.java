import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char a = obj.next().charAt(0);

        switch (a) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("vowel");
                break;

            default:
                System.out.println("not a vowel");
        }
    }
}
