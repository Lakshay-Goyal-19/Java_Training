// import java.util.Scanner;


// public class Method {
//     static public void main(String [] args){
//         m1();
//     }
//     public static void m1(){
//         System.out.println("m1 start");
//         m2();
//         System.out.println("m1 end");
//     }
//     public static void m2(){
//         System.out.println("m2 start");
//         m3();
//         System.out.println("m2 end");
//     }
//     public static void m3(){
//         System.out.println("m3 start");
//         System.out.println("m3 end");
//     }
// }


// public class Method {
//     static int num=0;
//     static public void main(String [] args){
//         m1();
//     } 
//     public static void m1(){
//         num++;
//         m2();
//     }
//     public static void m2(){
//         System.out.println(num);
//         m1();
//     }
//     //this will give the error of stackoverflow
// }


// public class Method {
//     static public void main(String [] args){
//     //main method has a formal argument 
//     m1(); //way to call no argument method
//     }
//     static void m1(){ 
//     //m1 is a method with zero arguments
//     }
// }


// public class Method {
//     public static void main(String [] args){
//         add();
//     }
//     public static void add(){
//         int num1=10;
//         int num2=30;
//         System.out.println(num1+num2);
//     }
// }


// public class Method {
//     public static void main(String [] args){
//         add(5,5);
//         add(200,600);
//     }
//     public static void add(int num1,int num2){
//         // int num1=10;
//         // int num2=30;
//         System.out.println(num1+"+"+num2+"= "+(num1+num2));

//     }
// }


// //code to convert uppercase to lower case
// public class Method {
//     static public void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character:- ");
//         char ch= sc.next().charAt(0);
//         tolowercase(ch);
//     }
//     static void tolowercase(char cha){
//         System.out.println((cha>='A'&&cha<='Z')? (char) (cha+=32):cha);
//     }
// }


// public class Method {
//     static public void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character:- ");
//         char ch= sc.next().charAt(0);
//         tolowercase(65);
//         //this will give an error because the formal arguement 
//         //type is different from actual argument
//     }
//     static void tolowercase(char cha){
//         System.out.println(cha);
//     }
// }


// public class Method {
//     public static void main(String [] args){
//         add(10,20);
//     }
//     static public void add(int n1,int n2){
//         System.out.println(n1+n2);
//     }
// }



// public class Method {
//     public static void main(String [] args){
//         int add = add(10,20);  
//         //in add variable the value 30 gets stored 
//         //now we can use the value returned by the method add
//         System.out.println(add);
//     }
//     static public int add(int n1,int n2){
//         return n1+n2;
//     }
// }


// public class Method {
//     public static void main(String [] args){
//         int s=sqr(9);
//         System.out.println(s);
//     }
//     public static void sqr(int n){
//         System.out.println(n*n);
//     //this will give an error as no value is returned
//     // to the main function so it cannot be stored inside s variable
//     }
// }



// find the area of a circle and method acceps the radius
//find the cube of any number 
// create a method that will return a string type of data->
//->if the input is even then it will return Even and if Odd Odd
// public class Method {
//     public static void main(String [] args){
//         int cube=cube(9);
//         double area=areaofcircle(1);
//         System.out.println(cube);
//         System.out.println(evenodd(5));
//         System.out.println(area);

//     }
//     public static int cube(int n){
//         return n*n*n;
//     }
//     public static double areaofcircle(int r){
//         return 3.14*r*r;
//     }
//     public static String evenodd(int n){
//         String s= (n%2==0)?"Even":"Odd";
//         return s; 
//     }
// }


// public class Method {
//     public static void main(String [] args){

//     }
//     public static int main(){
//         return 10;
//         System.out.println("Hi");
//         //this will give an error because 
//         //the last statement of the block should be return
//     }
// }


// public class Method {
//     public static void main(String [] args){
//         System.out.println(check(5));
//     }
//     public static String check(int num){
//         return (num%2==0)? "Even":"Odd";
//     }
// }


// //program that shows method overloading (based on length)
// public class Method {
//     public static void main(String [] args){
//         add(50,40,30);
//     //for this particualr input with three arguments it will 
//     //run the later add method with 3 argumetns
//     }
//     public static void add(int a,int b){
//         System.out.println(a+b);//method with the same name
//         //but different formal arguments 
//     }
//     public static void add(int a,int b,int c){
//         System.out.println(a+b+c);
//     }
// }

// //method overloading based on the type
// public class Method {
//     static public void main(String [] args ){
//         add(1,2.1);
//     }
//     static public void add(int a,int b){
//         System.out.println(a+b);
//     }
//     static public void add(double a,double b){
//         System.out.println(a+b);
//     }
// }


// public class Method {
//     public static void main(String [] args){
//         String str = test(true);
//         System.out.println(str);
//         //here int,double,char,boolean is converted to String
//     }
//     public static String test(double a){
//         String s= ""+a;
//         return s;
//     }
//     public static String test(char a){
//         String s= ""+a;
//         return s;
//     }
//     public static String test(long a){
//         String s= ""+a;
//         return s;
//     }
//     public static String test(boolean a){
//         String s= ""+a;
//         return s;
//     }
// }

import java.util.Scanner;
public class Method {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        String s=sc.nextLine();
        // String s1=sc.next();
        // boolean b=sc.nextBoolean();
        System.out.println(s);
    }
}
