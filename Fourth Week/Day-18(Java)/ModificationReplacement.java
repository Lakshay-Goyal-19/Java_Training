public class ModificationReplacement {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println(str1.replace('H', 'P'));//replace all old characters with new ones
        System.out.println(str1.replaceAll("ll", "pp"));//replace all matches of regex with replacement
        System.out.println(str1.toLowerCase());//converts to uppercase
        System.out.println(str1.toUpperCase());//converts to lowercase
    }
}
