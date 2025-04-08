//input1 ="Fi er"
//input2 ="Fever:filer:Filter:Fixer:Fiber:Fibre:tailor:offer"
//output String should be returned as "FILER:FIXER:FIBER"
//these are the possible words that can complete imput1
public class IdentifyPossibleWords {

    public String possibleWords(String s1, String s2) {
        String[] words = s2.split(":");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            if (word.length() != s1.length()) continue;

            boolean match = true;
            for (int i = 0; i < s1.length(); i++) {
                char patternChar = s1.charAt(i);
                if (patternChar != '_' && Character.toLowerCase(patternChar) != Character.toLowerCase(word.charAt(i))) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (ans.length() > 0){
                    ans.append(":");
                }
                ans.append(word.toUpperCase());
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s1 = "Fi_er";
        String s2 = "Fever:filer:Filter:Fixer:Fiber:Fibre:tailor:offer";

        IdentifyPossibleWords obj = new IdentifyPossibleWords();
        String result = obj.possibleWords(s1, s2);
        System.out.println(result); 
    }
}

