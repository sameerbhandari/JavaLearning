package concepts.BuildUpLogicalThinking.Arrays;

import java.util.Arrays;

public class SecondLargest {

    public static int secondLargestDigit(int[] arr){
        int size = arr.length;
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        return  secondMax;
    }

    public static int secondLargestDigitInString(String str){
        int size = str.length();
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i < size; i++){
            if(Character.isDigit(str.charAt(i))){
                int currentDigit = Integer.parseInt(""+str.charAt(i));
//                System.out.println(currentDigit);
                if(currentDigit > max){
                    secondMax = max;
                    max = currentDigit;
                }
                else if(currentDigit > secondMax){
                    secondMax = currentDigit;
                }
            }
        }
        return  secondMax;
    }

    public static int occurenceWordinString(String str, String word){
        int sizeOfString = str.length();
        System.out.println(sizeOfString);
        int sizeOfWord = word.length();
        System.out.println(sizeOfWord);
        int count = 0;

        if(sizeOfString < sizeOfWord){
            return 0;
        }
        for(int i = 0; i <= (sizeOfString - sizeOfWord); i++){
            System.out.println(str.substring(i, i+sizeOfWord));
            if(str.substring(i, i+sizeOfWord).equalsIgnoreCase(word)){
                i = i + sizeOfWord -1;
                count++;
            }
        }

        return count;
    }

    static int[] mergeTwoArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];

        for(int i = 0; i < result.length; i++){
            if(i < arr1.length){
                result[i] = arr1[i];
            }
            else{
                result[i] = arr2[i - arr1.length];
            }
        }
        return result;
    }

    public static int[] twoSum(int[] arr) {
        return new int[]{1, 2};
    }



    public static void main(String[] args) {
        int[] arr = {5, 6, 7 , 11, 12, 87, 887, 65};
        int[] arr2 = {84,42,44, 44, 55};
        String str = "ab0c548753cg5dh";
        String str1 = "MySameerSameer name is SameerSameerSameer";
        System.out.println(Arrays.toString(mergeTwoArrays(arr, arr2)));
    }
}
