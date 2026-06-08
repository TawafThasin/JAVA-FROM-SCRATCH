import java.awt.im.spi.InputMethodDescriptor;
import java.util.Scanner;

public class TernaryOperators10
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x1 = x.nextInt();

        if (x1 % 2 == 0)
            System.out.println("The value is EVEN!");
        else
            System.out.println("The value is ODD!");


        int y = 15;
        int result = 0;

        result = y % 2 == 0 ? 10 : 11;
            System.out.println(result);



    }
}
