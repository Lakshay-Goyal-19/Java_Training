//input - [0,1,0,1,1,1,1,0]
//output - [1,1,1,1,1,0,0]
import java.util.*;
public class ZeroandOne {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int n=sc.nextInt();
        System.out.println("Enter the elements into the array:- ");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int temp;
        boolean swapped;

        do {
            swapped = false; 
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] == 1) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true; 
                }
            }
        } while (swapped); 
        System.out.println(Arrays.toString(arr));



    }

}
