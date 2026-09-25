package org.example;

import java.util.Stack;

public class Find_Duplicate_Parenthesis_or_not {
    public static boolean findDuplicateParenthesis(String s){

        Stack<Character>st = new Stack<>();
        char [] str = s.toCharArray();
        for(char ch : str){
            if(ch == ')'){
                char top = st.peek();
                st.pop();

                int elementInside = 0;
                while(top != '('){
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

        String str = "(((a+(b))+(c+d)))";

        if(findDuplicateParenthesis(str)){
            System.out.println("Duplicate Found");
        }else {
            System.out.println("No Duplicate Found");
        }

    }
}
