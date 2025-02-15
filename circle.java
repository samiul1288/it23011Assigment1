import java.util.Scanner;

class circle1{
    private double r;
    public void setRadius(double r) throws Exception{
        if(r<0)
        {
            throw new Exception("{Invaid Radius}");
        }
        this.r=r;
    }
    public double calculateArea(){
        return Math.PI*r*r;
    }
}
public class circle {
    public static void main(String[] args) {
        circle1 c = new circle1();
        try {
            Scanner s = new Scanner(System.in);
            double r1 = s.nextDouble();
            c.setRadius(r1);
            System.out.printf("Area of circle is: %.4f\n",c.calculateArea());
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());

        }
    }
}
