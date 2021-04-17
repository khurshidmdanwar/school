// Java program to find Pronic Number
import java.util.*;
class PronicNumber
{
    public static void main(String args[]) 
    {

        int n, i;           // n for number and i for loop
        boolean f=false;    // f for flag, initialize with false
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find pronic or not : ");
        n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            if(i*(i+1) == n)
            {
                f = true;
                break;
            }
        }
         // Checking the pronic number
        if(f == true)
            System.out.println(n+" is a Pronic Number.");
        else
            System.out.println(n+" is not a Pronic Number.");    
    }
}