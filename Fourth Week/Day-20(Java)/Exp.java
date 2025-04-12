//how to make it so that finally block will not work
public class Exp {
    public static void main(String[] args) {
        Car c =null;
        System.out.println("Start");
        try {
            System.out.println(c.price);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.exit(0);//this is a static method
            //JVM will stop working after this line
        }
        finally{
            System.out.println("End");
        }
    } 
}
