import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter String");
        String  s1=s.nextLine();
        s.close();
        int[]count=q7(s1);
        System.out.println("Letters :"+count[0]);
        System.out.println("Digits: " + count[1]);
        System.out.println("Whitespace: " + count[2]);
    }
    public static int[] q7(String s1){
        int l=0,d=0,ws=0;
        for(char ch:s1.toCharArray()){
            if(Character.isLetter(ch)){
                l++;
            }
            else if(Character.isDigit(ch))
            {
                d++;
            }
            else if(Character.isWhitespace(ch))
            {
                ws++;
            }
        }
        return new int[]{l,d,ws};
    }

}
