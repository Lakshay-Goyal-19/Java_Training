//input is size of array and elements in the array
//example Input - [1,2,3,4,5] Output - 2  ,we can change 4 to 2 and 5 to 1 
//we have to return the minimum changes should be made to make it like a mountain
//like in the first half the value increase by one and in the later half value decreaases by 1

import java.util.*;
public class Coding2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int n=sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elemeents into the array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(mountain(arr, n));
    }
    public static int mountain(int [] arr,int n){
       int mid=n/2;
       int i=mid-1;
       int j=mid+1;
       int count=0;
       while(i>=0 && j<=arr.length){
        if(arr[mid]!=arr[i]+1 && arr[mid]!=arr[j]+1){
            count++;
        }
        i--;
        j++;
        
       }
       return count;
    }
    
}
