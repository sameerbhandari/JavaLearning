package concepts.BuildUpLogicalThinking.Arrays;

public class FirstMissingPositiveInteger {
  public static int firstMissingPositiveIntegerBruteForce(int[] arr) {
    int firstMissingPositive = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != firstMissingPositive) {
        return firstMissingPositive;
      }
      firstMissingPositive++;
    }
    return firstMissingPositive;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,5,6,7};
    int result  = firstMissingPositiveIntegerBruteForce(arr);
    System.out.println(result);
  }
}
