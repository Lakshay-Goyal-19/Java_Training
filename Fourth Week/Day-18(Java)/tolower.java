public class tolower {
    public static void main(String[] args) {
        String str1 = "Try Karte Hai";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                result.append((char)(ch + 32));
            } else {
                result.append(ch); // keep as is
            }
        }
        System.out.println(result.toString());

    }
}
