//swap two given indexed elements from the array

import java.util.Arrays;
import java.util.Scanner;

public class Question29 {
    public static int [] swap(int [] arr,int i1,int i2,int n){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array:- ");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements into the array:- ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the indexes you want to swap:- ");
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        sc.close();
        System.out.println("After swaping:- "+Arrays.toString(swap(arr, i1, i2, n)));
    }
}
