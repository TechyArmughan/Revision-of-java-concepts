//To check whether the entered number is Niven number or not.
import java.util.Scanner;
public class NivenNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n = sc.nextInt();
        int sum=0,digit;
        int orignum=n;
        while(n!=0)
        {
            digit = n % 10;
            n=n/10;
            sum = sum+digit;
        }
        if(sum!=0 && orignum% sum == 0)
        {
            System.out.println(orignum+" is a Niven Number.");
        }
        else
        {
            System.out.println(orignum+" is not a Niven Number.");
        }
    }
}
