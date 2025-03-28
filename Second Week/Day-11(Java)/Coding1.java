import java.util.*;
//Input- [7,1,5,3,6,4]
//Stocks boought on day 2 (price = 1) and sell on day 5 (price =6) , profit =6-1=5
//Output:- 5
//If you cannot make profit return zero
public class Coding1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int n=sc.nextInt();
        System.out.println("Enter array elements:- ");
        int [] stocks = new int[n];
        for (int i = 0; i < stocks.length; i++) {
            stocks[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(profit(stocks, n));
    }
    public static int profit(int[] arr,int n){
        if (n == 0) return 0; 
         // int max=0;
        // for (int i = 0; i < arr.length; i++) {
        //     // int price=arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         max=Math.max(max, arr[j]-arr[i]);
        //     }
        // }
        // return max;
        int minPrice = arr[0];  
        int maxProfit = 0;     
        for (int i = 1; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];  
            } else {
                maxProfit = Math.max(maxProfit, arr[i] - minPrice); 
            }
        }
        return maxProfit;           
    }
}

