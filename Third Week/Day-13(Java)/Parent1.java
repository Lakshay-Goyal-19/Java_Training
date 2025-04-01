public class Parent1 {
    static int a=10;
    int b=20;
    static{
        System.out.println("Parent class static block");
    }
    {
        System.out.println("Parent class non static block");
    }
    Parent1(){
        System.out.println("Parent class constructor");
    }
    public static void m1(){
        System.out.println("Parent class static method");
    }
    public void m2(){
        System.out.println("Parent class non-static method");
    }
}
