public class BasicStringMethod {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println(str1.length());//gives the length that is 5
        System.out.println(str1.charAt(4));//gives the character at a particular index
        System.out.println(str1.substring(1, 5));//it excludes the endIndex
        System.out.println(str1.compareTo(str2));//compares both the strings
        System.out.println(str1.compareToIgnoreCase(str2));//ignores case
        System.out.println(str1.isEmpty());//returns true if length is zero
        System.out.println(str1.equals(str2));//checks the address 
        System.out.println(str1.isBlank());//does not take blank space also
    }
}
