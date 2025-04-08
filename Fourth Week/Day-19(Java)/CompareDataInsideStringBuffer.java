//Inside StringBuffer and StringBuilder equals method is not overridden 
//inside both of them it will check the address
//but inside the String class it will override the equals code 
public class CompareDataInsideStringBuffer {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("4.5LPA");
        StringBuilder s2 = new StringBuilder("4.5LPA");
        //following line does not check address because
        //equals method is overridden in String class
        System.out.println(s1.toString().equals(s2.toString()));
        //toString converts the StringBuilder to String
    }
}