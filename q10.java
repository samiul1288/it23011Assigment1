import java.util.Scanner;

public class q10 {
//to cheack if the string or number is palidrome or not
    static boolean P(String s1) {
        String reversed = new StringBuilder(s1).reverse().toString();
        return reversed.equals(s1);
    }
    static boolean P2(int A)
    {
        int o=A,reverse=0;

        while(A>0){
        int d=A%10;
        reverse=reverse*10+d;
        A=A/10;
    }
    return o==reverse;
}
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    if(s.hasNextInt())
    {
        int A=s.nextInt();
        P2(A);
        if(P2(A))
            System.out.println("The Number is Palidrome:"+A);
        else
            System.out.println(+A+"The number is Not Palidrome:");
    }
    else
        System.out.println("Enter a String");
    String s1=s.next();

    if(P(s1))
    {
        System.out.println("The String is Palidrome:\n"+s);
    }
    else
        System.out.println("The String is not Palidrome");


}
}

