package concepts.BuildUpLogicalThinking.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String str) {

        if (str.length() % 2 != 0 || str.charAt(0) == ')' || str.charAt(0) == ']' || str.charAt(0) == '}') {
            return false;
        }
        char lastOpen = '*';
        int lastOpenIndex = -1;
        int i = 0;
        while (i < str.length() && lastOpenIndex < 0) {
            char s = str.charAt(i);
            if (s == '(' || s == '{' || s == '[') {
                lastOpen = s;
                lastOpenIndex = i;
            }
            if (s == ')' && lastOpen == '(') {
                lastOpenIndex = lastOpenIndex - 1;

            }
            if (s == ']' && lastOpen == '[') {
                lastOpenIndex = lastOpenIndex - 1;
            }
            if (s == '}' && lastOpen == '{') {
                lastOpenIndex = lastOpenIndex - 1;
            }
            i++;
        }
        return true;
    }
    public static boolean usingStack(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == '(' || s == '{' || s == '[') {
                stack.push(s);
            }
            else{
                boolean condition1 = stack.peek() == '{' && s == '}';
                boolean condition2 = stack.peek() == '(' && s == ')';
                boolean condition3 = stack.peek() == '[' && s == ']';
                if(!stack.isEmpty() && (condition1 || condition2 || condition3)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[]}";
        if(usingStack(str)){
            System.out.println("String is valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
