package concepts.BuildUpLogicalThinking;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
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
