package concepts.BuildUpLogicalThinking.Arrays;

public class ConcatenationOfArray {

  public static int[] getConcatenation(int[] nums) {
    int sizeOfResult = 2 * nums.length;
    int[] res = new int[sizeOfResult];
    for (int i = 0; i < nums.length; i++) {
      res[i] = nums[i];
    }
    for (int i = nums.length; i < sizeOfResult; i++) {
      res[i] = nums[i - nums.length];
    }
    System.out.println(res);
    return res;
  }
}
