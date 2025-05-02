package concepts.BuildUpLogicalThinking.Strings;

public class RomanToInteger {
    static int giveDemimalForRoman(char c){
        if(c == 'I'){
            return 1;
        }
        else if(c == 'V'){
            return 5;
        }
        else if(c == 'X'){
            return 10;
        }
        else if(c == 'L'){
            return 50;
        }
        else if(c == 'C'){
            return 100;
        }
        else if(c == 'D'){
            return 500;
        }
        else if(c == 'M'){
            return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            int digit1 = giveDemimalForRoman(c1);

            if((i + 1) < s.length()){
                char c2 = s.charAt(i+1);
                int digit2 = giveDemimalForRoman(c2);

                if(digit1 >= digit2){
                    result = result + digit1;
                }
                else{
                    result = result + (digit2 - digit1);
                    i++;
                }
            }
            else{
                result = result + digit1;
            }
        }
        return result;
    }
}
