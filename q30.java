import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take input for 'n' (must be > 20)
        System.out.print("Enter the size of first array (n > 20): ");
        int n = s.nextInt();
        while (n <= 20) {
            System.out.print("Invalid input! Enter n > 20: ");
            n = s.nextInt();
        }

        // Corrected array size calculation
        int m = (int) Math.ceil(n / 10.0);

        int[] a1 = new int[n];
        int[] a2 = new int[m];
        int[] r = new int[m];
        int[] reminder = new int[m];

        // Input for first array
        System.out.println("Enter the elements of a1:");
        for (int i = 0; i < n; i++) {
            a1[i] = s.nextInt();
        }

        // Input for second array
        System.out.println("Enter the elements of a2 (non-zero values only):");
        for (int i = 0; i < m; i++) {
            a2[i] = s.nextInt();
            while (a2[i] == 0) { // Prevent division by zero
                System.out.print("Zero not allowed! Enter a non-zero value: ");
                a2[i] = s.nextInt();
            }
        }

        // Compute quotient and remainder
        for (int i = 0; i < m; i++) {
            r[i] = (int) Math.ceil((double) a1[i] / a2[i]); // Ceiling quotient
            reminder[i] = a1[i] % a2[i]; // Remainder
        }

        // Display results
        System.out.println("\nIndex\t\tA1\t\tA2\t\tQuotient\tRemainder");
        for (int i = 0; i < m; i++) {
            System.out.println(i + "\t" + a1[i] + "\t" + a2[i] + "\t" + r[i] + "\t\t" + reminder[i]);
        }

        s.close();
    }
}
