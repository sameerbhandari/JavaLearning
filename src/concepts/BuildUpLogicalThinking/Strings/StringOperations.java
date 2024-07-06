package concepts.BuildUpLogicalThinking.Strings;

import java.util.*;

public class StringOperations {
    public static String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static String reverseString2(String str) {
        String result = "";
        String[] strArray = str.split("");
        int left = 0;
        int right = str.length() - 1;
        while (left <= right){
            String c = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = c;
            left++;
            right--;
        }
        for(String s : strArray){
            result = result.concat(s);
        }
        return result;
    }
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> hashSet = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (!hashSet.contains(str.charAt(i))) {
                result.append(str.charAt(i));
                hashSet.add(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static boolean isPalindrome(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> hashSet = new HashSet<Character>();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        String resultString = result.toString();
        return resultString.equals(str);
    }
    public static boolean isAnagram(String str1, String str2) {
        Set<Character> str1Set = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            str1Set.add(str1.charAt(i));
        }
        Set<Character> str2Set = new HashSet<>();
        for (int i = 0; i < str2.length(); i++) {
            str2Set.add(str2.charAt(i));
        }
        return str2Set.equals(str1Set);
    }
    public static char firstNonRepeatedCharacter(String str) {
        char resultChar = '*';
        Map<Character, Integer> hMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character charAtI = str.charAt(i);
            Integer countOfChar = hMap.get(charAtI);
            hMap.put(charAtI, hMap.containsKey(charAtI) ? countOfChar + 1 : 1);
        }

        for (Map.Entry<Character, Integer> e : hMap.entrySet()) {
            System.out.println(e.getKey() + ">" + e.getValue());
            if (e.getValue() == 1) {
                resultChar = e.getKey();
                return e.getKey();
            }
        }
        return resultChar;
    }
    public static int countOfUpperCase(String str) {
        int upperCount = 0;
        int lowerCount = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            }
        }
        System.out.println(
                "Total Count = " +
                        count +
                        "Upper Count = " +
                        upperCount +
                        ", LowerCount = " +
                        lowerCount
        );
        return count;
    }
    public static String reverseOrderOfWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            result.append(strArr[i]).append(" ");
        }
        return result.toString();
    }
    public static Character largestOccurrence(String str) {
        int countOfChar = 0;
        Map<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            countOfChar =
                    hmap.containsKey(currentChar) ? hmap.get(str.charAt(i)) + 1 : 1;
            hmap.put(currentChar, countOfChar);
        }
        int maxCount = 0;
        Character maxOccurenceCharacter = ' ';

        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxOccurenceCharacter = entry.getKey();
            }
        }
        return maxOccurenceCharacter;
    }
    public static boolean isSpecialCharacter(char c){
        boolean isUpperCaseAlphabet = c >= 'A' && c <= 'Z';
        boolean isLowerCaseAlphabet = c >= 'a' && c <= 'z';
        return !isUpperCaseAlphabet && !isLowerCaseAlphabet;
    }
    public static String reverseAlphabetsOnly(String str){
        String result="";
        String[] strArray = str.split("");
        int right = str.length()-1;
        int left = 0;
        while(left <= right){

            if(isSpecialCharacter(str.charAt(left))){
                left = left+1;
            }
            if(isSpecialCharacter(str.charAt(right))){
                right = right-1;
            }
//                System.out.println("char at Left: " + strArray[left]);
//                System.out.println("char at Right: " + strArray[right]);
            String c = "";
            c = strArray[left];
            strArray[left] =strArray[right];
            strArray[right] =c;
            left++;
            right--;
        }

        for(String s: strArray){
            result = result.concat(s);
        }
        return result;
    }
}
