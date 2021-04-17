public class SpecialNumber
{
    public static void main(String args[])
    {
        int num, temp, f, i, r, sum=0;
        num=145;
        temp=num;
        while(num!=0)
        {
            r=num % 10;
            f=1;
            for(i=1; i<=r; i++)
            {
                f=f * i;
            }
            sum=sum+f;
            num=num/10;
        }
        if(sum==temp)
            System.out.println("Special number");
        else
            System.out.println("Not special number");
    }
}
