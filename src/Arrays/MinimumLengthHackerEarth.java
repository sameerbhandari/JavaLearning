package Arrays;

public class MinimumLengthHackerEarth {
    public static int minimumLength(int[] a, int[] b){
        int first = 0;
        int last = 0;

        //find first different position where number a[i]!=b[i]
        for(int i = 0; i < a.length; i++){
            if(a[i]!=b[i]){
                first = i;
                break;
            }
        }
        for(int j = a.length-1; j>=0; j--){
            if(a[j]!=b[j]){
                last = j;
                break;
            }
        }
        if(first == last){
            return 0;
        }
        return last-first+1;
    }
}
