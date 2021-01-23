import java.util.*;
public class sum
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers for which you would like to find the sum of the numbers between (inclusive)." + "\n" + "The first number you input should be less than the second number you input.");
        int left = input.nextInt();
        int right = input.nextInt();
        System.out.println("The sum of the numbers between " + left + " and "+ right + " inclusive is " + sumRange(left,right));
    }
    
    //Precondition: int l < int r
    public static int sumRange(int l, int r)
    {
        if (r == l)
        {
            return l;
        }
        return r + sumRange(l,r-1);
    }
}