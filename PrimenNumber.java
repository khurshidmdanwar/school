public class PrimenNumber
{
    public static void main(String args[])
    {
        int n, i, f=1;
        n=9;
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                f=0;
                break;
            }
        }
        if(f==1)
            System.out.println(n + " is a Prime number");
        else
            System.out.println(n + " is not Prime number");
    }
}
