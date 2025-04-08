//A string is a good string if the number of occurances of each element is same
//for example abacbc is a good string
// a - 2 times, b - 2 times, c - 2 times
// String consists of only lowercase english letters
import java.util.*;
public class GoodString {
    public static void main(String[] args) {
        String s1 = "abacbca";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int expectedFreq = freqMap.get(s1.charAt(0));
        boolean isGood = true;

        for (int freq : freqMap.values()) {
            if (freq != expectedFreq) {
                isGood = false;
                break;
            }
        }
        if (isGood) {
            System.out.println("Good String");
        } else {
            System.out.println("Not a Good String");
        }
       
        
    }
    
}
