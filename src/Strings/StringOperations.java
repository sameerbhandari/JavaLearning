package Strings;

import java.awt.desktop.SystemEventListener;
import java.util.*;

public class StringOperations {
    public  static  String reverseString(String str){
        StringBuilder result = new StringBuilder();
        for(int i = str.length()-1; i>=0;i--){
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static String removeDuplicates(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> hashSet = new HashSet<Character>();

        for (int i = 0; i< str.length(); i++){
            if(!hashSet.contains(str.charAt(i))){
                result.append(str.charAt(i));
                hashSet.add(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean isPalindrome(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> hashSet = new HashSet<Character>();
        for(int i = str.length()-1; i>=0;i--){
            result.append(str.charAt(i));
        }
        String resultString = result.toString();
        return resultString.equals(str);
    }

    public static  boolean isAnagram(String str1, String str2){
        Set<Character> str1Set = new HashSet<>();
        for(int i = 0; i < str1.length(); i++){
            str1Set.add(str1.charAt(i));
        }
        Set<Character> str2Set = new HashSet<>();
        for(int i = 0; i < str2.length(); i++) {
            str2Set.add(str2.charAt(i));
        }
        return str2Set.equals(str1Set);
    }
    public static char firstNonRepeatedCharacter(String str){
        char resultChar='*';
        Map<Character, Integer> hMap = new LinkedHashMap<>();
        for(int i =0; i < str.length(); i++){
            Character charAtI = str.charAt(i);
            Integer countOfChar = hMap.get(charAtI);
            hMap.put(charAtI, hMap.containsKey(charAtI)?countOfChar+1:1);
        }

        for(Map.Entry<Character, Integer> e: hMap.entrySet()){
            System.out.println(e.getKey() + ">" + e.getValue());
            if(e.getValue() == 1){
                resultChar = e.getKey();
                return e.getKey();
            }
        }
        return resultChar;
    }

    public  static int countOfUpperCase(String str){
        int upperCount = 0;
        int lowerCount = 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            if(str.charAt(i) >= 'A' && str.charAt(i)<='Z'){
                upperCount++;
            }
            if(str.charAt(i) >= 'a' && str.charAt(i)<='z'){
                lowerCount++;
            }
        }
        System.out.println("Total Count = "+ count + "Upper Count = "+ upperCount+ ", LowerCount = "+lowerCount);
        return count;
    }

    public static String reverseString2(String str){
        String result ="";
        for(int i = str.length()-1; i >=0; i--){
            result = result.concat(""+str.charAt(i));
        }
        return result;
    }
}
