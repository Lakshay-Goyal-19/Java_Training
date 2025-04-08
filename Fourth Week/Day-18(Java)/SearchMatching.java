public class SearchMatching {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println(str1.contains("ll"));//returns true if the subString is present 
        System.out.println(str1.indexOf("e")); //returns index of first occurance of the String
        System.out.println(str1.lastIndexOf("l"));//returns index of last occurance
        System.out.println(str1.startsWith("e"));//check if String starts with given prefix
        System.out.println(str1.endsWith("l"));//checks if the String ends with given suffix
    }
}
