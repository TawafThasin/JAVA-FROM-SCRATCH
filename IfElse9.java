import java.util.Scanner;

public class IfElse9
{
	public static void main(String[] args)
	{
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int n = a.nextInt();
        if(n > 5)
            System.out.println("Encryption Done");
        else
            System.out.println("Encryption Failed");


        int c = 5;
        if(true)
            System.out.println("Encryption Done");


        int b = 7;
        if(false)
            System.out.println("Encryption Failed");


        Scanner d = new Scanner(System.in);
        System.out.println("Enter the number d: ");
        int d1 = d.nextInt();
        Scanner e = new Scanner(System.in);
        System.out.println("Enter the number e: ");
        int e1 = e.nextInt();
        Scanner f = new Scanner(System.in);
        System.out.println("Enter the number f: ");
        int f1 = f.nextInt();

        if(d1 > e1 && d1 > f1)
            System.out.println("D is the greatest number");
        else if(e1 > d1 && e1 > f1)
            System.out.println("E is the greatest number");
        else
            System.out.println("F is the greatest number");


        

    }
}
