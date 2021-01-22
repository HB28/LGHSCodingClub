import java.util.*;
public class factorial
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value you would like to get the factorial of  ");
        int num = input.nextInt();
        System.out.println("The factorial of " + num + " is " + recursiveNum(num));
    }
    
    //-1 is returned if recursiveNum recieves a negative integer for the parameter
    public static int recursiveNum(int start)
    {
        if (start == 0)
        {
            return 1;
        }
        else if (start < 0)
        {
            return -1;
        }
        return start * recursiveNum(start - 1);
    }
}