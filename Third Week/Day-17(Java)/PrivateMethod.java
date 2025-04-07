class PrivateMethod implements p1{
    public static void main(String[] args) {
        PrivateMethod p = new PrivateMethod();
        p.m1();
    }
}
interface p1 {
    default void m1(){
        System.out.println("p1");
        privateMethod();

    }
    private void privateMethod(){ //private non static method can only be accessed 
        //inside the interface
        System.out.println("Private Non Static Method");
    }   
}