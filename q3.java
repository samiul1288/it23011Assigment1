import  java.util.Scanner;




public class q3 {
    public static int fact(int num)
    {
        int f=1;
        for(int i=1;i<=num;i++) {
            f *= i;
        }
        return f;
    }
    public static boolean isfactrionCheck(int num)
    {
        int sum=0,temp=num;
        while(temp>0)
        {
            int d=temp%10;
            sum+=fact(d);
            temp=temp/10;

        }
        return sum==num;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        System.out.println("The Range is :"+l+"to"+r);
        for(int i=l;i<=r;i++)
        { if( isfactrionCheck(i)){ System.out.println("The fractional NUmber is:"+i);
        }
        }
    }}