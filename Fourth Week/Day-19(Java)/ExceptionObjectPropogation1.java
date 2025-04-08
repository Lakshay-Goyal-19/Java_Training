import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionObjectPropogation1 {
    public static void main(String[] args) throws FileNotFoundException {
        m1();
    }
    public static void m1() throws FileNotFoundException{
        m2();
    }
    private static void m2() throws FileNotFoundException{
        FileInputStream file = new FileInputStream("Demo.txt");
    }
}
