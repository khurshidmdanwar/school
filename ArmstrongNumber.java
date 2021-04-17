public class ArmstrongNumber
{
    public static void main(String args[])
    {
        int n=152, temp, r, sum=0;
        temp=n;
        while(n!=0)
        {
            r=n % 10;
            sum=sum + r * r * r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong number");
    }

}
