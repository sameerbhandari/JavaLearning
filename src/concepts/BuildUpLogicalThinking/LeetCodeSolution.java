package concepts.BuildUpLogicalThinking;

public class LeetCodeSolution {
    public static void mergeArray(int[] arr1, int[] arr2, int[] resultantArray){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int left = 0;
        int right= 0;
        int mainPointer = 0;

        while(left < l1 && right < l2){
            if(arr1[left] < arr2[right]){
                resultantArray[mainPointer] = arr1[left];
                left++;
            }
            else{
                resultantArray[mainPointer] = arr2[right];
                right++;
            }
            mainPointer++;
        }
        while(left < l1){
            resultantArray[mainPointer] = arr1[left];
            left++;
            mainPointer++;
        }
        while(right < l2){
            resultantArray[mainPointer] = arr2[right];
            right++;
            mainPointer++;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int newSize = l1+l2;
        int[] resultantArray = new int[newSize];
        mergeArray(nums1, nums2, resultantArray);
        int mid = (newSize-1)/2;
        if(newSize%2 != 0){
            return resultantArray[mid];
        }
        return (double) (resultantArray[mid] + resultantArray[mid + 1]) /2;
    }

    public static void main(String[] args) {
        LeetCodeSolution solution = new LeetCodeSolution();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
