import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("txt");
        //it will still give the error
    }
}
