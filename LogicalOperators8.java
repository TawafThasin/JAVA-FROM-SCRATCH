public class LogicalOperators8
{
    public static void main(String[] args)
    {
        int x = 8;
        int y = 7;
        int a = 7;
        int b = 9;

        boolean result1 = (x > y) && (a > b); //Both needs to be true
        System.out.println(result1);
        boolean result2 = (x > y) || (a > b); //Only one needs to be true
        System.out.println(result2);
        boolean result3 = (x > y) == (a > b); //Checks conditions are equal
        System.out.println(result3);

    }
}
