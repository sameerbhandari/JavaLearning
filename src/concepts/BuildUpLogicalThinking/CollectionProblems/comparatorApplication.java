package concepts.BuildUpLogicalThinking.CollectionProblems;

import java.util.*;

public class comparatorApplication {

    public static List<String> sortByLength(List<String> words){
//       words.sort();
       return  words;
    }

    public static String sortByCountOfOccurence(String str){
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            if(!hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i), 1);
            }
            else{
                int newCount = hashMap.get(str.charAt(i)) + 1;
                hashMap.put(str.charAt(i), newCount);
            }
        }

        List<Map.Entry<Character, Integer>> entrySet =  new ArrayList<>(hashMap.entrySet());
        entrySet.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Character, Integer> entry : entrySet) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }

    public static String test(String str){
        StringBuilder stringBuilder = new StringBuilder();
        int[] charArray = new int[26];
        for(int i = 0; i < str.length(); i++){
            int character = 'A';
            int i1 = Integer.parseInt("" + str.charAt(i)) - character;
            if(charArray[i1] != 0){
                charArray[i1] += 1;
            }
            else{
                charArray[i1] = 1;
            }
        }
        for(int i = 0; i < charArray.length; i++){

        }
        return  stringBuilder.toString();
    }

    public static void main(String args[]){
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "mango");

        String str = "aaknaldnfadnjgjand";
        System.out.println(sortByCountOfOccurence(str));
    }

    public static class HashMapImplementation {
        public static void main(String[] args) {
            String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZABC";
            String[] strArr = str.split("");

            Map<String, Integer> hmap = new HashMap<>();

            for(String s: strArr){
                Integer count;
    //            if(!hmap.containsKey(s)){
    //                hmap.put(s, 1);
    //            }
    //            else{
    //                count = hmap.get(s);
    //                hmap.put(s, count + 1);
    //            }
                count = hmap.containsKey(s)? hmap.get(s) +1 : 1;
                hmap.put(s, count);
            }
            for(Map.Entry entry: hmap.entrySet()){
                System.out.print(entry.getKey() + "=>");
                System.out.println(entry.getValue());
            }
        }
    }
}
