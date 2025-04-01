public class Child1 extends Parent1 {
    static int c=30;
    int d=40;
    static{
        System.out.println("Child class static block");
    }
    {
        System.out.println("Child class non-static block");
    }
    Child1(){
        System.out.println("Child class constructor");
    }
    public static void m3(){
        System.out.println("Child class static method");
    }
    public void m4(){
        System.out.println("Child class non-static method");
    }

    public static void main(String[] args) {
        Child1 ch=new Child1();
        System.out.println(ch.a);
        System.out.println(ch.b);
        ch.m2();
        ch.m1();
        ch.m3();
        ch.m4();
    }
}
