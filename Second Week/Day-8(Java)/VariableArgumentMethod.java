import java.util.Arrays;
//how to use variable argument method

//we can pass values while calling the function
//it will convert it into array
public class VariableArgumentMethod {
    public static void add(String s,int ... a){
        System.out.println(s+Arrays.toString(a));
    }
    public static void main(String [] args){
        add("abc",2,3,4);
    }
}
