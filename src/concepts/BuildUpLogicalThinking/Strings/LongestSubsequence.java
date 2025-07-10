package concepts.BuildUpLogicalThinking.Strings;

public class LongestSubsequence {
    public static int  getlengthOfLongestSubsequence(String str1, String str2, int m, int n){
        if(m == -1 || n == -1){
            return 0;
        }
        System.out.println("m => " + m );
        System.out.println("n => " + n );
        if(str1.charAt(m) == str2.charAt(n)){
            int lengthOfSubstring =  1 + getlengthOfLongestSubsequence(str1, str2, m-1, n-1);
            System.out.println("Length of Substring => " + lengthOfSubstring);
            return lengthOfSubstring;
        }

        return Math.max(getlengthOfLongestSubsequence(str1, str2, m -1, n), getlengthOfLongestSubsequence(str1, str2, m, n-1));
    }

    public static void main(String[] args) {
        String str1 = "adbc";
        String str2 = "xadybzc";
        int m = str1.length();
        int n = str2.length();

        System.out.println(getlengthOfLongestSubsequence(str1, str2, m-1, n-1));
    }
}
