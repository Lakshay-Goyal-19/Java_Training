//to reverse the string array 
import java.util.Arrays;
import java.util.Scanner;

public class Question30 {
    public static String[] rev(String[] str, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:- ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()
        //Always do this before entering data into String

        String[] arr = new String[n];
        System.out.println("Enter elements into the array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine(); 
        }
        sc.close();

        System.out.println("Reversed array: " + Arrays.toString(rev(arr, n)));
    }
}
