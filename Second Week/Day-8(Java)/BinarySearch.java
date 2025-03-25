//binary search

import java.util.Scanner;

    public class BinarySearch {
        public static int BinarySearch1(int[] arr, int key) {
            int mid,left,right;
            left=0;
            right=arr.length-1;
            
            while(left<=right){
                mid=left+(right-left)/2;
                if(key==arr[mid]){
                    return mid;
                }
                else if(key<arr[mid]){
                    right=mid-1;
                }
                else if(key>arr[mid]){
                    left=mid+1;
                }
            }
            return -1;
            
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of the array:- ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements into the array:- ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the key:- ");
            int key=sc.nextInt();
            sc.close();
            System.out.println("Index at which number is present:- "+BinarySearch1(arr,key));

        }
    }

