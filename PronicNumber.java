import java.util.Scanner;
public class PronicNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check : ");
        int n = sc.nextInt();
        boolean isPronic = false;
        for(int i = 0;i<= n-1;i++)
        {
            if(i*(i+1) == n)
            {
                isPronic = true;
                break;
            }
        }
        if(isPronic)
        {
            System.out.println(n+" is a Pronic Number.");
        }
        else
        {
            System.out.println(n+" is not Pronic Number.");
        }
    }
}
