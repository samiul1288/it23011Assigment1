import java.io.*;
import java.util.*;
public class SimpleNumberProcessor1 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("C:/Users/HP/OneDrive/Desktop/ALL pdf/input.txt"));
            s.useDelimiter(",");
            int max = Integer.MIN_VALUE;
            while (s.hasNextInt()) {
                max = Math.max(max, s.nextInt());
            }
            s.close();
            if (max == Integer.MIN_VALUE) { // No numbers found
                System.out.println("Error: No valid numbers found in input file.");
                return;
            }
            int sum = max * (max + 1) / 2;
            PrintWriter writer = new PrintWriter("C:/Users/HP/OneDrive/Desktop/ALL pdf/output.txt");
            writer.println("Max: " + max);
            writer.println("Sum: " + sum);
            writer.close();
            System.out.println("Processing complete. Check output.txt for results.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Check the path!");
        }
    }
}
