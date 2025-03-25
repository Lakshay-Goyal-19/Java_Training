import java.util.*;
//program to find the occurance of each elements in an int array
public class OccuranceofElements {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of the array:- ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements into the array:- ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();

            for (int i = 0; i < arr.length; i++) {
                int freq=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        freq++;
                        arr[j]=Integer.MIN_VALUE;
                    }
                }
            if(arr[i]!=Integer.MIN_VALUE)
            System.out.println(arr[i]+" : "+freq);
            }
            
    }
}




