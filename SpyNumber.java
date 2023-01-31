//To check whether a number is spy number or not.
import java.util.Scanner;
public class SpyNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n = sc.nextInt();
        int sum=0,prod=1;
        int digit,originalnum=n;
        while(n>0)
        {
            digit = n%10;
            sum = sum + digit;
            prod = prod*digit;
            n= n/10;
        }
        if(sum==prod)
        {
            System.out.println(originalnum+" is a Spy number");
        }
        else
        {
            System.out.println(originalnum+" is not a spy number");
        }
    }
}
