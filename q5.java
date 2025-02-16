import java.util.Scanner;

public class q5 {
    public static int  cSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] A = new int[size];
        System.out.println("Enter " + size + "elements :");
        for (int i = 0; i < size; i++) {
            A[i] = s.nextInt();
        }
        int sum = cSum(A);
        System.out.println(sum);
    }
}

