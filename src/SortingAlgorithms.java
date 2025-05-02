public class SortingAlgorithms {


    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j <= n - 1 - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int currentMin = minValueInArray(arr, i, arr.length-1);
            int j = arr.length - 1;
            while (j > i){
                arr[j] = arr[j-1];
                j--;
            }
            arr[i] = currentMin;
        }
        return arr;
    }

    public int[] selectionSortV2(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public int minValueInArray(int[] arr, int start, int end) {
        //find the value in [start, end]
        int min = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void merge(int[] arr, int left, int mid, int right){
        int[] leftArray = new int[mid-left+1];
        int[] rightArray = new int[right - mid];

        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = arr[left+i];
        }
        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = arr[mid+1+i];
        }
        int leftPointer = 0;
        int rightPointer = 0;
        int mainArrayPointer = left;

        //Based on left and right array values creating arr
        while (leftPointer < leftArray.length && rightPointer < rightArray.length){
            if(leftArray[leftPointer] < rightArray[rightPointer]){
                arr[mainArrayPointer] = leftArray[leftPointer];
                leftPointer++;
            }
            else{
                arr[mainArrayPointer] = rightArray[rightPointer];
                rightPointer++;
            }
            mainArrayPointer++;
        }
        //Adding remaining element if leftArray have remaining element
        while (leftPointer < leftArray.length){
            arr[mainArrayPointer] = leftArray[leftPointer];
            leftPointer++;
            mainArrayPointer++;
        }
        //Adding remaining element if rightArray have remaining element
        while (rightPointer < rightArray.length){
            arr[mainArrayPointer] = rightArray[rightPointer];
            rightPointer++;
            mainArrayPointer++;
        }
    }
    public void mergeSort(int[] arr, int left, int right){
        int mid = left + (right-left)/2;
        if(left < right){
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
        }
        merge(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] arr = {15, 14, 13, 12, 11};
        SortingAlgorithms sortingAlgo = new SortingAlgorithms();
        sortingAlgo.mergeSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
