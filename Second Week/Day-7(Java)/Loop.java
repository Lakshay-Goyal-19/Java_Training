// import java.util.Scanner;
import java.util.Arrays;

// public class Loop {
//     public static void main(String [] args){
        // int num=123;
        // int ans=0;
        // while(num!=0){
        //     ans=ans*10+num%10;
        //     num/=10;
        // }
        // System.out.println("Reverse is:- "+ans);
//     }
// }



// public class Loop {
//     public static int reverse(int n){
//         int ans=0;
//         while(n!=0){
//         ans=ans*10+n%10;
//         n/=10;
//         }
//         return ans;
//     }
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter two numbers:- ");
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         int revnum1= reverse(num1);
//         int ans=0;
//         while(num2>0 || revnum1>0){
//             if(revnum1>0){
//                 ans=ans*10+revnum1%10;
//                 revnum1/=10;
//             }
//             if(num2>0){
//                 ans=ans*10+num2%10;
//                 num2/=10;
//             }  
//         }
//         //Output we want is 1 6 2 5 3 4
//         System.out.println("Answer is:- "+ans);
//     }
// }


//program to find the factors of a number
// public class Loop {
//     static public void main(String [] args){
//         int num=20;
//         int sp=1;
//         int count=0;
//         while(sp<=num){
//             if(num%sp==0){
//                 System.out.println(sp);
//                 count++;
//             }
//             sp++;
//         }
//         System.out.println("-----------------");
//         System.out.println(count);
//     }
// }



// public class Loop {

//     static boolean checkprime(int n){
//         int sp=2;
//         while(sp*sp<=n){
//             if(n%sp==0)
//                 return false;
//             sp++;
//         }
//         return true;
//     }
//     public static void main(String [] args) {        
//         int limit=20;
//         int sp=2;
//         while(limit>=sp){
//             if(checkprime(sp)){
//                 System.out.println(sp);
//             }
//             sp++;
//         }
//     }
// }


// public class Loop {
//     static public void main(String [] args){
//         while(false){

//         }
//         //will always give an error because it is unreachable
//     }
// }



// public class Loop {
//     static public void main(String [] args){
//         while(true){
//             System.out.println("hi");
//         }
// //will run an infinite loop
//     }
// }


// public class Loop {
//     static public void main(String [] args){
//         while(true)
//             System.out.println("hi");
//         while (false) {
//             System.out.println("hi1");
//         }
//     }
// }



// //syntax for do-while loop
// public class Loop {
//     static public void main(String [] args){
//         int i=1;
//         do{
//             System.out.println(i+ " ");
//             i++;
//         } while(i<=5);
//     }
// }


// //for loop syntax
// public class Loop{
//     static public void main(String [] args){
//         for(; ;){

//         }
//     }
// }


// //for loop example
// public class Loop{
//     static public void main(String [] args){
//         for(int i=1;i<10;i++)
//             System.out.println("Hi");
//     }
// }



// public class Loop {
//     static boolean checkprime(int n){
//         int sp=2;
//         while(sp*sp<=n){
//             if(n%sp==0)
//                 return false;
//             sp++;
//         }
//         return true;
//     }
//     public static void main(String [] args) {        
//         int limit=20;
//         int lower=8;
//         while(limit>=lower){
//             if(checkprime(lower)){
//                 System.out.println(lower);
//             }
//             lower++;
//         }
//     }
// }



// public class Loop{
//     //for only even digits 
//     static int add1(int n){
//         while(n>=10){
//             int sum=0;
//             while(n!=0){
//                 int digit=n%10;//this condition is added
//                 if(digit%2==0)
//                 sum+=n%10;
//                 n/=10;
//             }
//             n=sum;
//         }
//         return n;
//     }
//     static public void main(String [] args){
//         int num=4265;
//         System.out.println("Answer is: "+add1(num));
//     }
// }


//to find the single digit repeatedly by adding the digits
// public class Loop {
//     static int add1(int n) {
//         if (n == 0) return 0;
//         return (n % 9 == 0) ? 9 : (n % 9);
//     }

//     public static void main(String[] args) {
//         int num = 3456;
//         System.out.println("Final single-digit sum: " + add1(num));
//     }
// }



// public class Loop{
//     static public void main(String [] args){
//         int [] arr1 = new int[5];
//         //array is one of the object which is created 
//         //in heap area
//         arr1[0]=1;
//         arr1[1]=2;
//         arr1[2]=3;
//         arr1[3]=4;
//         arr1[4]=5;
//         System.out.println(arr1[0]);
//         System.out.println(arr1[1]);
//         System.out.println(arr1[2]);
//         System.out.println(arr1[3]);
//         System.out.println(arr1[4]);
//     }
// }


//use of loop to access array
// public class Loop{
//     static public void main(String [] args){
//         int [] arr = new int[5];
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }



// import java.util.Scanner;
// //in the case of String array the default value be null
// public class Loop{
//     static public void main(String [] args){
//         int [] arr=new int[5];
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the values in the array:- ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         // for(int i=0;i<arr.length;i+=2){
//         //     System.out.println(arr[i]);
//         // }
//         for(int i=(arr.length)-1;i>=0;i--){
//             System.out.println(arr[i]);
//         }
//     }
// }



// public class Loop{
//     static public void main(String [] args){
//         // int [] arr=new int[5];
//         //different way to create an array
//         int [] arr={1,2,3,4,5};
//         // int sum=0;
//         // for(int i=(arr.length)-1;i>=0;i--){
//         //                 System.out.println(arr[i]);
//         //             }
//         // for(int i=0;i<arr.length;i++){
//         //     sum+=arr[i];
//         // }
//         // System.out.println(sum);
//     }
// }


//Output is 1000
// public class Loop{
//     static public void main(String [] args){
//         int [] arr={1,2,3,4,5};
//         int [] newarr = arr;
//         newarr [0] = 1000;
//         System.out.println(arr[0]); 
//     }
// }



// public class Loop{
//     static public void main(String [] args){
//         int [] arr={1,2,3,4,5};
//         //copy the array using Array utility
//         int [] newarray = Arrays.copyOf(arr,arr.length);
//         for(int i=0;i<arr.length;i++){
//             System.out.println(newarray[i]);
//         }
//     }
// }



// //ArrayIndexOutofBoundsException
// public class Loop{
//     static public void main(String [] args){
//         int [] arr={1,2,3};
//         System.out.println(arr[arr.length]);
//     }
// }




// public class Loop{
//     public static int [] merge(int [] arr1,int [] arr2){
//         int [] arr3 = new int[arr1.length+arr2.length];
//         for(int i=0;i<arr1.length;i++){
//             arr3[i]=arr1[i];
//         }
//         for(int i=0;i<arr2.length;i++){
//             arr3[arr1.length+i]=arr2[i];
//         }
//         // for (int i = 0; i < arr3.length; i++) {
//         //     System.out.println(arr3[i]);
//         // }
//         return arr3;
//     } 
//     static public void main(String [] args){
//         int [] arr1={1,2,3};
//         int [] arr2={4,5,6};
//         //Output should be arr3 = 1,2,3,4,5,6
//         int [] arr3 = new int[arr1.length+arr2.length];
//         arr3= merge(arr1, arr2);
//         System.out.println(Arrays.toString(arr3));
//     }
// }



public class Loop{
    public static int rev(int n){
        int ans=0;
        while(n!=0){
            ans=ans*10+n%10;
            n/=10;
        }
        return ans;
    }
    static public void main(String [] args){
        int [] arr={12,31,43,89}; 
        //Output should be 21,13,34,98
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rev(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}