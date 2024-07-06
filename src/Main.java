import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0};
        Map<Integer, Integer> hmap = new HashMap<>();
        int[] resultArray = new int[arr.length];

        for(int i =0; i < arr.length; i++){
            int currentValue = arr[i];
            if(hmap.containsKey(currentValue)){
                int count = hmap.get(currentValue);
                hmap.put(currentValue, count + 1);
            }
            else{
                hmap.put(currentValue,1);
            }
        }
        int[] tempArray = new int[hmap.size()];
        int index = 0;

        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            tempArray[index] = entry.getValue();
        }

        Arrays.sort(tempArray);

        index = 0;
        for(int i = 0; i < tempArray.length;i++){
            int numberOfTimes = hmap.get(tempArray[i]);
            for(int j = 0; j< numberOfTimes; j++){
                resultArray[index] = tempArray[i];
                index++;
            }
        }
    }
}