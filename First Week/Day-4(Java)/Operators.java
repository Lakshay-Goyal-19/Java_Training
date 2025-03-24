import java.util.Scanner;

// class Operators{
//     public static void main(String [] args){    
//         System.out.println(10 && 20); // it will give an error as it 
//     }                                 // works only with boolean literals
// }


// class Operators{
//     public static void main(String [] args)
//     {
//         System.out.println(10>20?"hi":"bye");// gives output bye
//     }
// }


// class Operators{
//     public static void main(String [] args)
//     {
//         int num1=50;
//         int num2=30;
//         System.out.println(num1>num2?"num1":"num2");//num1 is printed
//     }
// }


// find the maximum of three using ternary operator
// class Operators{
//     public static void main(String [] args)
//     {
//         int num1=80;
//         int num2=70;
//         int num3=60;  //num1 is printed in this case
//         System.out.println(num1>num2?num1>num3?"num1":num2>num3?"num2":"num3":"num2");
//     }
// }


//find the maximum of three using ternary operator
// class Operators {
//     public static void main(String[] args) {
//         int num1 = 80;
//         int num2 = 70;
//         int num3 = 60;
//         // Using ternary operator to find the maximum value
//         int max = (num1 > num2) 
//                     ? (num1 > num3 ? num1 : num3) 
//                     : (num2 > num3 ? num2 : num3);

//         System.out.println("Maximum number is: " + max);
//     }
// }


// public class Operators {
//     public static void main(String [] args)
//     {
//         int a=10;
//         System.out.println(++a); // Pre-Increment 
//         System.out.println(a++);// Post-Increment 
//         System.out.println(a); // To show the post-increment in the previous line
//     }
    
// }



// public class Operators {
//     public static void main(String [] args)
//     {
//         int a=10;
//         int b=a++;
//         int c=++a;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
    
// }


// public class Operators {
//     public static void main(String [] args)
//     {
//         int a=10;
//         int b=10++;
//         int c=--a;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
// }


// public class Operators {
//     public static void main(String [] args)
//     {
//         int a=10;  //Output is 10
//         a=a--;  // It is so because of the assignment oper.(=)
//         a=a--; // that works from right to left 
//         a=a--;
//         System.out.println(a); 
//     }
// }


// public class Operators {
//     public static void main(String [] args)
//     {
//         char ch='A'; //Ouput is B
//         ch++;
//         System.out.println(ch);
//     }
// }


// public class Operators {
//     public static void main(String [] args)
//     {
//         byte b=127; //Output is -128
//         b++; //because it will circle around the value 
//         System.out.println(b); //from 127 to -128 then -127 and so on   
//     }
// }


// public class Operators {
//     public static void main(String [] args)
//     {
//         byte a=10;
//         byte b=20;
//         a+=b; //this compound assignment operator will cast the data into byte
//         System.out.println(a);//so there will be no error
//         System.out.println(b);

//     }
    
// }

// public class Operators {
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         int emily=sc.nextInt();
//         int jacob=sc.nextInt();
//         System.out.println(emily<jacob?"Jacod is older":"Emily is older");
//     }
// }



// // swapping two numeric values write a program tha enable them to swap these values without using a third variablecla
// public class Operators {

//     public static void main(String [] args){
//         int a=10;
//         int b=5;
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// public class Operators {
//     public static void main(String [] args){
//         double d=21;  // Output is 21.0
//         System.out.println(d);
//     }
// }


// public class Operators {
//     public static void main(String [] args){
//         double d=21; 
//         System.out.println(d);
//         int i=d; // throwing a error here
//         System.out.println(i);
//     }
// }

//Cast operator (datatype)
// public class Operators {
//     public static void main(String [] args){
//         int i = (int) 21.21; //output is 21
//         System.out.println(i);// .21 is lost
//     }
// }


// public class Operators {
//     public static void main(String [] args){
//         char ch=   97;
//     // 2 bytes ->  int-4 bytes
// //this is narrowing but in this case there is not error and
// //it is done by the compiler as 97 is in the range of character(2 bytes)
// }
// }


// public class Operators {
//     public static void main(String [] args){
//         int balance=100;
//         balance-=25;
//         balance+=2;
//         balance-=20;
//         balance+=2;
//         balance+=50;
//         balance+=2;
//         System.out.println(balance);
//     }
// }


// public class Operators {
//     public static void main(String [] args){
//         int num=20;
//         String s = (num<=80 && num>=20)?"Lies in the range":"Does not lie in the range" ;
//         System.out.println(s);
//     }
// }


// public class Operators {
//     public static void main(String [] agrs)
//     {  
//         Scanner sc= new Scanner(System.in);
//         // System.out.println("Enter a number:- ");
//         // int n=sc.nextInt();
//         System.out.println("Enter a character:- ");
//         char cha=sc.next().charAt(0);
//         String s= (cha>'A' && cha<'Z')? "Uppercase":"Lowercase";
//         System.out.println(s);
//     }
// }


public class Operators {
    public static void main(String [] args){
        add();
    }
    public static void add(){
        int n1=10;
        int n2=20;
        System.out.println(n1+n2);
    }
}