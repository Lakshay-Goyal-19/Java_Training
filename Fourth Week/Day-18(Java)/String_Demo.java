import java.util.*;
// public class String_Demo {
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2=new String("Hello");
//         System.out.println(str1 == str2);//false
//         //because address is different
//     }
// }



// public class String_Demo {
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         str1.concat("Hi");//stored inside the heap area
//         System.out.println(str1);
//     }
// }



// public class String_Demo {
//     public static void main(String[] args) {
//         //Ouput is HelloHello
//         String str1 = new String("Hello");
//         String str2 = new String("Hello");
//         str1 = str1.concat(str2);//str1 will store the address of the new string returned by concat
//         System.out.println(str1);
//     }
// }



// public class String_Demo {
//     //Output is HelloHello
//     public static void main(String[] args) {
//         StringBuffer str1 = new StringBuffer("Hello");
//         String str2 = new String("Hello");
//         str1.append(str2);//append is used with StringBuffer
//         //StringBuffer is mutable
//         System.out.println(str1);
//     }
// }



public class String_Demo {
    //Output is HelloHello
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
        String str2 = new String("Hello");
        str1.append(str2);//append is used with StringBuffer
        //StringBuffer is mutable
        System.out.println(str1);
        System.out.println(str1.charAt(1));
    }
}