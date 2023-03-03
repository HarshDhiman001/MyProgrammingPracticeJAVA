import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner choise = new Scanner(System.in);
        System.out.println("enter the number");
        int c = choise.nextInt();
        System.out.println("Answer :- ");
        switch (c)
        {
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("harsh");
            break;
            case 3:
            System.out.println("jatt");
            break;
            case 4:
            System.out.println("dhiman");
            break;
            default:
            System.out.println("Wrong entry");
            break;
        }
    }
}
