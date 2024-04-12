package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class interview {

    public static String reverseOrderOfWords(String str){
        String result = "";
        String[] strArr = str.split(" ");
        for(int i = strArr.length-1; i >=0; i--){
            result = result + strArr[i] + " ";
        }
        return result;
    }
    public static Character largestOccurence(String str){
        int countOfChar = 0;
        Map<Character, Integer> hmap = new HashMap<>();
//        for(int i = 0; i < str.length(); i++){
//            char currentChar = str.charAt(i);
//            hmap.put(currentChar, 0);
//        }

        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            countOfChar = hmap.containsKey(currentChar) ? hmap.get(str.charAt(i)) + 1 : 1;
            hmap.put(currentChar, countOfChar);
        }
        int maxCount = 0;
        Character maxOccurenceCharacter = ' ';

        for (Map.Entry<Character,Integer> entry : hmap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxOccurenceCharacter = entry.getKey();
            }
        }
    return maxOccurenceCharacter;
    }
}
