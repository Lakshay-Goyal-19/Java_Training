import java.util.*;
//find the duplicate elements and output them
//for example input is 1,1,1,1
//output array should be 1
public class DuplicateArray {
   
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:- ");
        int [] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            int freq=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    freq++;
                    arr[j]=0;
                }
            }
            if(freq>1 && arr[i]!=0 ) System.out.println(arr[i]);
        }
        sc.close();
        
    }
    
    
}
