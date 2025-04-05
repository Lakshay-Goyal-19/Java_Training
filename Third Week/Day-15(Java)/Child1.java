//method overriding 
public class Child1 extends Parent1 {
    public Parent1 m(){
        System.out.println("Not Marry");
        return null;
    }
    public static void main(String[] args) {
        Parent1 p = new Child1();//upcasting
        p.m();//here the method of child will work even after upcasting
    }
}
