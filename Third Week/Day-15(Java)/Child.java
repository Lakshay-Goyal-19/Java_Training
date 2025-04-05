public class Child extends Parent {
    public static void main(String[] args) {
        Parent p = new Child(); //upcasting 
        System.out.println(p);//It will print the address
        Child ch = (Child) p;//Downcasting
        System.out.println(ch);//It will print the address
        //Output is same
        //Address is same
        
    }
}
