import java.util.Scanner;

// public class Test {
//     public static void main(String [] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter Age: ");
//         int age=sc.nextInt();
//         System.out.println("Enter Name:- ");
//         String name=sc.nextLine();
//         System.out.println("Name: "+name );
//         System.out.println("Age:"+age);
// //this will not take string, the variable will be empty 
// //it will only take age because we used nextLine()
//     }
// }



// public class Test {
// //this will solve the problem by adding the sc.nextLine()
// //solving the previous problem
//     public static void main(String [] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter Age: ");
//         int age=sc.nextInt();
//         System.out.println("Enter Name:- ");
//         sc.nextLine();
//         String name=sc.nextLine();
//         System.out.println("Name: "+name );
//         System.out.println("Age:"+age);
// //this will not take string, the variable will be empty 
// //it will only take age because we used nextLine()
//     }
// }


// public class Test {
//     public static void main(String [] args){
// //here the default delimiter is the space and sc.next()
// //is printing the elements 
//         Scanner sc= new Scanner("10 20 30");
//         System.out.println(sc.next());
//         System.out.println(sc.next());
//         System.out.println(sc.next());
//     }
// }



// public class Test {
//     public static void main(String [] args){
// //here the default delimiter is the space and sc.next()
// //is printing the elements 
// //we have changed the "10 20 30" and stored it in a string
// // hasNext is returning boolean literals that is true and false
//         String str="10 20 30";
//         Scanner sc= new Scanner(str);
//         System.out.println(sc.next());
//         System.out.println(sc.hasNext());
//         System.out.println(sc.next());
//         System.out.println(sc.hasNext());
//         System.out.println(sc.next());
//         System.out.println(sc.hasNext());

//     }
// }



// public class Test {
//     public static void main(String [] args){
// //here the default delimiter is the space and sc.next()
// //is printing the elements 
// //we have changed the "10 20 30" and stored it in a string
// // hasNext is returning boolean literals that is true and false

// //default delimiter is changed to :
//         String str="10:20:30";
//         Scanner sc= new Scanner(str);
//         sc.useDelimiter(":");
//         System.out.println(sc.next());
//         System.out.println(sc.hasNext());
//         System.out.println(sc.next());
//         System.out.println(sc.hasNext());
//         System.out.println(sc.next());
//         System.out.println(sc.hasNext());
//     }
// }


// public class Test {
//     public static void main(String [] args){
//         StaticMethod.m1();
//     }
// }



// public class Test {
//     void main(String [] args){
//         display(10f);
//     }
//     void display(int x){
//         System.out.println("Integer"+ x);
//     }
//     void display(double x){
//         System.out.println("Double"+ x);
//     }
// }


// public class Test {
//     public static void main(String [] args){
//         // StaticMethod.m1();
//         StaticMethod d1 = new StaticMethod();
//         d1.m1();
//     }
// }


// public class Test {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num=sc.nextInt();
//         if(num%2==0){
//             System.out.println("Even Number");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }


// public class Test {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the character:- ");
//         char ch=sc.next().charAt(0);
//         System.out.println(vowel(ch));
//     }
//     static String vowel(char ch){
//         if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u' )
//         {
//             String s="It is a vowel";
//             return s;
//         }
//         else{
//             String s="It is a consonant";
//             return s;
//         }

//     }
// }


// public class Test {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a=sc.nextInt();
//         System.out.println("Enter Second Number: ");
//         int b=sc.nextInt();
//         System.out.println("Enter Third Number: ");
//         int c=sc.nextInt();
//         task(a,b,c);
//     }
//     static void task(int a,int b,int c){
//         int count=0;
//         if(a%2==0) count++;
//         if(b%2==0) count++;
//         if(c%2==0) count++;
//         if(count==1){
//             if(a%2==0) System.out.println(a);
//             if(b%2==0) System.out.println(b);
//             if(c%2==0) System.out.println(c);
//         }
//         if(count==2){
//             if((a%2==0) && (b%2==0)) System.out.println(a+b);
//             if((b%2==0) && (c%2==0)) System.out.println(b+c);
//             if((a%2==0) && (c%2==0)) System.out.println(a+c);
//         }
//         if(count==3)
//             System.out.println(a*b*c);
//         if(count==0)
//         {
//             System.out.println(0);
//         }
//     }
// }


// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter third number: ");
//         int c = sc.nextInt();
//         task(a, b, c);
//         sc.close(); // Closing the scanner to prevent resource leaks
//     }

//     static void task(int a, int b, int c) {
//         int count = 0;
//         if (a % 2 == 0) count++;
//         if (b % 2 == 0) count++;
//         if (c % 2 == 0) count++;

//         if (count == 1) {
//             if (a % 2 == 0) 
//                 System.out.println(a);
//             else if (b % 2 == 0) 
//                 System.out.println(b);
//             else 
//                 System.out.println(c);
//         } else if (count == 2) {
//             if (a % 2 == 0 && b % 2 == 0) 
//                 System.out.println(a + b);
//             else if (b % 2 == 0 && c % 2 == 0) 
//                 System.out.println(b + c);
//             else 
//                 System.out.println(a + c);
//         } else if (count == 3) {
//             System.out.println(a * b * c);
//         } else { // count == 0
//             System.out.println(0);
//         }
//     }
// }



// public class Test {
//     static public void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number:- ");
//         int n1=sc.nextInt();
//         System.out.println("Enter second number:- ");
//         int n2=sc.nextInt();
//         parameter(n1,n2);
//     }
//     static void parameter(int n1,int n2){
//         if(n1==0 || n2==0){
//             System.out.println(3);
//         }
//         if(n1%n1==0){
//             System.out.println(2);
//         }
//         else{
//             System.out.println(1);
//         }
//     }
// }


// public class Test {
//     public static void main(String [] args){
//         int num=2;
//         switch (num) {
//             case 1:{
//                 System.out.println("Case block 1");
//                 break;
//             }
//             case 2:{
//                 System.out.println("Case block 2");
//                 break;
//             }
//             default:{
//                 System.out.println("Default case block");
//                 break;
//             }
//         }
//     }
// }




public class Test {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:- ");
        int n2=sc.nextInt();
        System.out.println("Enter the operation performed:- ");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
            System.out.println(-1);
        }

    }
}