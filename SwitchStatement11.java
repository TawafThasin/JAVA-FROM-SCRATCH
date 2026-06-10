import java.util.Scanner;

public class SwitchStatement11
{
    public static void main(String[] args)
    {
        Scanner x1 = new Scanner(System.in);
        System.out.print("Enter the day number of the week: ");
        int n = x1.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number!");
        }


        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        input.close();

        switch (name)
        {
            case "Tawaf":
                System.out.println("You're missing Thasin Talukder");
                break;
            case "Thasin":
                System.out.println("You're missing Tawaf Talukder");
                break;
            case "Tawaf Thasin":
                System.out.println("You're missing Talukder");
                break;
            case "Thasin Talukder":
                System.out.println("You're missing Tawaf");
                break;
            case "Tawaf Talukder":
                System.out.println("You're missing Thasin");
                break;
            default:
                System.out.println("Name is incorrect!");
        }

    }
}
