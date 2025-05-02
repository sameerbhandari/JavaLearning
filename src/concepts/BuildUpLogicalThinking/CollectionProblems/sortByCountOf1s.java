package concepts.BuildUpLogicalThinking.CollectionProblems;

import java.util.*;

public class sortByCountOf1s {
    //convert number into Binary
    //Count number of 1's
    //Store this in hashMap, integer -> countOf1's
    //Sort based on number of ones

    public static String convertToBinary(int num){
//        String binaryString = ;
        return Integer.toBinaryString(num);
    }

    public static int countNumOf1s(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void  sortByCountof1(List<Integer> list){
        Map<Integer, Integer> hmap = new HashMap<>();

        for(Integer item: list){
            hmap.put(item, countNumOf1s(convertToBinary(item)));
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(hmap.entrySet());
        l.sort((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> i : l){
            System.out.print(i.getKey() + " =>");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 8, 9);
        sortByCountof1(list);
    }
}
