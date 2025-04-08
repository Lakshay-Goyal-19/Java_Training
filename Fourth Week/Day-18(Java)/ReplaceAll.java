public class ReplaceAll {
    public static void main(String[] args) {
        String s1 = "I    HATE    JAVA";
        s1 = s1.replaceAll("\\s+", " ");
        System.out.println(s1);
    }
}


