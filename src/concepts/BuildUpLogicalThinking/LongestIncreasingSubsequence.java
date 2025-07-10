package concepts.BuildUpLogicalThinking;

public class LongestIncreasingSubsequence {

    public int getLongestIncreasingSubArray(int[] list){
        //check whether the subsequence is sorted
        //compareLength with existing subsequence
        //set this length to result;
        int maxLength = 1;
        int left = 0;
        int right = left + 1;
        int tempLength = 1;
        while (right <= list.length){
            if(list[left] < list[right]){
                tempLength++;
                right++;
            }
            else {
                if(tempLength > maxLength){
                    maxLength = tempLength;
                }
                tempLength = 1;
                left = right;
                right = left + 1;
            }
        }
        return maxLength;
    }

    public int getLengthOfLongestIncreasingSubsequence(int[] list, int i, int j){
        boolean isSorted = ifSortedArray(list, i, j);
        if(isSorted){
            return list.length;
        }
        else{
            return 1 + Math.max(getLengthOfLongestIncreasingSubsequence(list, i+1, j), getLengthOfLongestIncreasingSubsequence(list, i, j+1));
        }
    }

    public static void main(String[] args) {

    }
}
