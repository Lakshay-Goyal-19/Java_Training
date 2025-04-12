//do sorting based on the price field of Phone class object array
//Natural Sorting
import java.util.Arrays;
public class PhoenDriver {
    public static void main(String[] args) {
        Phone[] phones =new Phone[4];
        phones[0] = new Phone("Xiaomi",  1000,64);        
        phones[1] = new Phone("Samsung", 700,64);        
        phones[2] = new Phone("Apple", 700,128);        
        phones[3] = new Phone("Realme", 700,256); 
        System.out.println("Before Sorting:---------------------------------- ");       
        for(Phone p:phones){
            System.out.println(p);
        }
        // Arrays.sort(phones);/this will give the ClasscastException
        Arrays.sort(phones);//sort function call the compareTo method which is overridden in Phone class
        System.out.println("After Sorting:---------------------------------- ");
        for(Phone phone:phones){
            System.out.println(phone);
        }
    }
}