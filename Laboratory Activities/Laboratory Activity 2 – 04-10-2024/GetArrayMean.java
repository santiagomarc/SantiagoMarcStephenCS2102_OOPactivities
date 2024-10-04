import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  
        }
        double mean = (double) sum / arr.length;
        return mean;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = input.nextInt();
        }

        double mean = getArrayMean(arr);
        System.out.printf("Mean of array is: %.2f\n", mean);

        input.close();
    }
}