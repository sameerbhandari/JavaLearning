public class FirstMissingPositiveInteger {
    public static int firstMissingPositiveIntegerBruteForce(int[] arr){
        int n = arr.length;
        int firstMissingPositive = 1;
        for(int i=0; i < n; i++){
            if(arr[i] != firstMissingPositive){
                return  firstMissingPositive;
            }
            firstMissingPositive++;
        }
        return firstMissingPositive;
    }
}
