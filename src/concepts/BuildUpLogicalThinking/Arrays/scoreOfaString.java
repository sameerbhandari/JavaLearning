package concepts.BuildUpLogicalThinking.Arrays;

public class scoreOfaString {
    public static int scoreOfString(String str) {
        int score = Math.abs(str.charAt(0) - str.charAt(1));
        System.out.println(score);
        for(int i = 1; i<str.length()-1;i++){
            score = score + Math.abs(str.charAt(i) - str.charAt(i+1));
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }
}
