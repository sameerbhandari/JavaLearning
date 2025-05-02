package concepts.BuildUpLogicalThinking.CollectionProblems;

import java.util.*;

public class comparatorApplication {

    public static List<String> sortByLength(List<String> words){
//       words.sort();
       return  words;
    }

    public static String sortByOccurence(String str){
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
            result.append(entry.getKey() +"" + entry.getValue());
        }
        return result.toString();
    }

    public static void main(String args[]){
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "mango");

        String str = "aaknaldnfadnjgjand";
        System.out.println(sortByOccurence(str));
    }
}
