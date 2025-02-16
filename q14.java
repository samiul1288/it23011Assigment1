import java.math.BigInteger;
import java.util.Scanner;

public class q14 {
    public static BigInteger f(BigInteger n){
        BigInteger r=BigInteger.ONE;
        for(BigInteger i=BigInteger.ONE;i.compareTo(n)<=0;i=i.add(BigInteger.ONE)){
            r=r.multiply(i);

        }
        return r;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        BigInteger b=BigInteger.valueOf(n);
        BigInteger fact=f(b);
        System.out.println("Factorial of "+n+ "is "+fact);
        s.close();
    }

}
