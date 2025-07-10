package concepts.BuildUpLogicalThinking.CollectionProblems;

import java.util.*;

public class AskedInterviewQuestions {
    static void getGroupOfAnagrams(String[] strArray){
        Map<String, List<String>> hmap = new HashMap<>();

        for(int i  = 0 ; i < strArray.length; i++){
            String currentString = strArray[i];
            char[] charArray = currentString.toCharArray();
            Arrays.sort(charArray);

            //convert this charArray back to String;
            String keyString = String.copyValueOf(charArray);
            if(hmap.containsKey(keyString)){
                //add this word to the list
                List<String> tempList = hmap.get(keyString);
                tempList.add(currentString);
                hmap.put(keyString, tempList);
            }
            else{
                List<String> tempList = new ArrayList<>();
                tempList.add(currentString);
                hmap.put(keyString, tempList);
            }
        }
        System.out.println(hmap);

    }

    public static void sortTheListofHAshMap() {
        List<Map<String, String>> result = new ArrayList<>();
        Map<String, String> hmap= new HashMap<>();
        hmap.put("productName", "abc");
        hmap.put("price", "56");
        hmap.put("pId", "100");

        result.add(hmap);

        Map<String, String> hmap2= new HashMap<>();
        hmap2.put("productName", "abc");
        hmap2.put("price", "55");
        hmap2.put("pId", "101");
        result.add(hmap2);

        result.sort((a, b)->{
            int currentPriceA = Integer.parseInt(a.get("price"));
            int currentIDA = Integer.parseInt(a.get("pId"));

            int currentPriceB = Integer.parseInt(b.get("price"));
            int currentIDB = Integer.parseInt(b.get("pId"));

            if(currentPriceA == currentPriceB){
                if(currentIDA < currentIDB){
                    return currentIDA - currentIDB;
                }
            }
            return currentPriceA - currentPriceB;
        });
        System.out.println(result.toString());
    }
}
