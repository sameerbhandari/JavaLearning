package concepts.BuildUpLogicalThinking.Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        //each character should have count of 2 or divisible by 2 .
        //only one character have count of odd count.
        //abccccdd =>
        //longest palindrome will be all even number.
        Map<Character, Integer> hmap = new HashMap<>();

        for(int pos = 0; pos < s.length(); pos++){
            int currentCount = hmap.containsKey(s.charAt(pos))? hmap.get(s.charAt(pos)) + 1 : 1;
            hmap.put(s.charAt(pos), currentCount);
        }
        int count = 0;
        boolean addedOdd = false;
        for(Map.Entry<Character, Integer> entry : hmap.entrySet()){
            int countOfChar = entry.getValue();
            if(countOfChar % 2 == 0){
                count = count + countOfChar;
            }
            else{
                if(!addedOdd){
                    count = count + countOfChar;
                    addedOdd = true;
                }
                else{
                    count = count + countOfChar - 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
