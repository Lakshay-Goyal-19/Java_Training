//Output is p1
public class Dproblem implements p1,p2 {
    public void m1(){
        p1.super.m1();
    }
    public static void main(String[] args) {
        p1 objp2  = new Dproblem();
        objp2.m1();     
    }
}
interface p1 {
    default void m1(){
        System.out.println("p1");
    }  
}
interface p2{
    default void m1(){
        System.out.println("p2");
    }  
}
