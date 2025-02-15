import java.io.*;
import java.util.*;

public class SimpleNumberProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/HP/OneDrive/Desktop/ALL pdf/input.txt"));
        s.useDelimiter(",");

        int max = 0;
        while (s.hasNextInt()) {
            max = Math.max(max, s.nextInt());
        }
        s.close();

        int sum = max * (max + 1) / 2;

        PrintWriter writer = new PrintWriter("C:/Users/HP/OneDrive/Desktop/ALL pdf/output.txt");
        writer.println("Max: " + max);
        writer.println("Sum: " + sum);
        writer.close();
    }
}
