package org.example;

import java.util.Stack;

public class Find_Duplicate_Parenthesis_or_not {
    static boolean findDuplicateParenthesis(String s){

        Stack<Character>st = new Stack<>();
        char [] str = s.toCharArray();
        for(char ch : str){
            if(ch == ')'){
                char top = st.peek();
                st.pop();

                int elementInside = 0;
                while(ch != '('){
                    elementInside++;
                    top = st.peek();
                    st.pop();
                }
                if(elementInside < 1){
                    return true;
                }
            }else {
                st.push(ch);
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
