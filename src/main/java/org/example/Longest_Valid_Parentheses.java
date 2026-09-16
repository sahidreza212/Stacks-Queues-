package org.example;

import java.util.Stack;

public class Longest_Valid_Parentheses {
    public static int maxLength(String s){

        Stack<Integer>st = new Stack<>();
        st.push(-1);
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else {
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                }else {
                    maxLen = Math.max(maxLen,i-st.peek());
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {

        String s = "(()())";
        System.out.print(maxLength(s));

    }
}
