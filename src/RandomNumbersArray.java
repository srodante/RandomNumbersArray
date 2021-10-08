import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbersArray {
    public static void main (String[] args) {
        int[] numbers;
        int[] origNumbs;
        int sz, min = 30, max = 40;
        Scanner keybd = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many numbers would you like to generate? ");
        sz = keybd.nextInt();

        origNumbs = new int[sz];
        numbers = new int[sz];
        for (int i = 0; i <= sz - 1; i++) {
            origNumbs[i] = rand.nextInt((max - min) + 1) + min;
        }

        // Copy the array
        for (int i = 0; i < origNumbs.length; i++) {
            numbers[i] = origNumbs[i];
        }

        Arrays.sort(numbers);

        System.out.println("Original Numbers:");
        System.out.println(Arrays.toString(origNumbs));
        System.out.println("Sorted Numbers:");
        System.out.println(Arrays.toString(numbers));
    }
}
