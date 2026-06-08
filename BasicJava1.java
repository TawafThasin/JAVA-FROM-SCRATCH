package basicjava;
import java.util.Scanner;

public class BasicJava1 //We cannot use any . or anything beside class and it needs to same as the file name
{
    public static void main(String[] args)
    {
        System.out.println("Tawaf Thasin Talukder"); //println produces a new line
        System.out.println("01740592888");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
    }
}

