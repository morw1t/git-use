import java.util.Arrays;
import java.util.Scanner;
public class AiPractic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count elements: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Array: " + Arrays.toString(array));
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);
        }
}