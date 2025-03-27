public class Static {
    //static works before the main method
    static int a=10;
    static{
        System.out.println("Static Block 1");
    }
    public static void main(String [] args){
        System.out.println("Main method start");
        System.out.println(a);
        System.out.println("Main method end");
    }
    static{
        System.out.println("Static Block 2");
    }
    static{
        System.out.println("Static Block 3");
    }
}
