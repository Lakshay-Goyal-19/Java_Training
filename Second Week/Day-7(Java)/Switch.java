// import java.util.Scanner;

// public class Switch {
//     public static void main(String [] args){
//         int n;
//         switch() { //it will give an error because the value is empty 
//             // in the switch statement
//             case 1:
//                 System.out.println("No output");
//                 break;
//             case 2:
//                 System.out.println("Output");
//                 break;
//             default:
//                 break;
//         }
//     }
// }


//Syntax for enhance switch
// public class Switch {
//     public static void main(String [] args){
//         int n=1;
//         String str =switch(n) { 
//             case 1-> "1";
//             case 2->"2";
//             default->"default";//here the default is mandatory 
//         }; //here the semicolon is required 
        
//         System.out.println(str);
//     }
// }


// public class Switch {
//     public static void main(String [] args){
//         int n=1;
//         String str =switch(n) { 
//             case 1-> "1";
//             case 2->"2";
//             case 3->{
//                 System.out.println("print");
//                 yield "for multiple values";
//                 // yield "just like this";
//                 // default "default";
//             }
//             default->"default";//here the default is mandatory 
//         }; //here the semicolon is required 
        
//         System.out.println(str);
//     }
// }



//this is how you write a final variable
// final a=10;



// public class Switch {
//     public static void main(String [] args){
//         int n=1;
//         switch (n) {
//             case 1,2,3:{
//                 //multiple cases in one case
//                 //this works both in traditional and enhanced switch
//                 System.out.println("Same task");
//                 break;
//             }
//             case 4:{
//                 System.out.println("second case");
//             }
//         }
//     }
// }



// public class Switch {
//     static public void main(String [] args){
//         //loops are required to perform a repititive task with a condition to end
//         //while(condition) meaning either true or false
//         //loop will stop if the condition is false meaning loop is terminated
//         // Updation is not part of the syntax but logic.

//         int n=5;
//         while(n!=0){
//             System.out.println("Print Statement "+ n);
//             n-=1;
//         } 
//     }
// }



