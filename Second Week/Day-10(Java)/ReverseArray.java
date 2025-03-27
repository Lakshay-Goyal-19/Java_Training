
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3}; // Use Integer (not int)

        // Sorting in descending order
        Arrays.sort(arr,Collections.reverseOrder());

        // Printing the sorted array
        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
    }
}
