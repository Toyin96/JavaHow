package Chapter7;

import com.timbuchalka.SearchArray;
import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates extends SearchArray {

    public static void main(String[] args) {
        numberCollector();
    }

    private static int[] listArray = new int[5];

    public static void numberCollector() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            System.out.print("Enter an integer: ");
            int number = scan.nextInt();

            if (!linearSearch(listArray, number)) {
                listArray[count] = number;
                count++;
            } else if (linearSearch(listArray, number)) {
                System.out.print("Oops! We found a match in the array");
            }
            System.out.println(Arrays.toString(listArray));
        }
    }
}