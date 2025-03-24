// import java.util.Scanner;

// public class Loop {
//     public static void main(String [] args){
//         int num=123;
//         int ans=0;
//         while(num!=0){
//             ans=ans*10+num%10;
//             num/=10;
//         }
//         System.out.println("Reverse is:- "+ans);
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


public class Loop {
    static public void main(String [] args){
        while(true)
            System.out.println("hi");
        while (false) {
            System.out.println("hi1");
        }
    }
}