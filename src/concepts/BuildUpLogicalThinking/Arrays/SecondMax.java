package concepts.BuildUpLogicalThinking.Arrays;

public class SecondMax {
    public static int secondMaxInArray(int[] arr){
        int max = arr[0];
        int secondMax = arr[1];

        if(max < secondMax){
            int temp = max;
            max = secondMax;
            secondMax = temp;
        }

        for(int i = 2; i < arr.length; i++){
           if(arr[i] > max){
               secondMax = max;
               max = arr[i];
           }
           else if(arr[i] > secondMax && arr[i] < max){
               secondMax = arr[i];
           }
        }
        return  secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,5,5,5};
        System.out.println(secondMaxInArray(arr));
    }
}
