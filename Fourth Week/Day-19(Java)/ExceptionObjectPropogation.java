import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionObjectPropogation {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        try{
            m2();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static void m2() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("demo.txt");
    }
}
