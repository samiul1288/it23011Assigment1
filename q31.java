import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class q31 {
    public static void main(String[] args){
        LocalDateTime n=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("HH:mm:ss");
        String a=n.format(f);
        String a1=n.format(f1);
System.out.println("Current Date :"+a);
        System.out.println("Current time :"+a1);


    }
}
