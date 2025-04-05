public class Test {
    {
        System.out.println("Non-static block");
    }
    static{
        System.out.println("Static block");
    }
    Test(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main method Start");
        System.out.println("Main method finish");
        // System.out.println("Main method");
    }
}
