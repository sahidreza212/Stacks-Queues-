package org.example;

import java.util.Stack;

public class Infix_To_Postfix {

    static int prec(char c){

        if(c == '^'){
            return 3;
        }
        else if(c == '*' || c == '/') {
            return 2;
        } else if(c == '+' || c == '-') {
            return 1;
        }
        else {
            return -1;
        }
    }

    static boolean isRightAssociative(char c){
        return c == '^';
    }

    public static String infixToPostfix(String s){

        Stack<Character>st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z') ||
                    (c >= '0' && c <= '9')){
                res.append(c);
            }

            // if '(' , push to stack
            else if(c == '(') {
                st.push(c);
            }
            // if ')', pop until '('
            else if(c == ')') {
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }
            // if operator
            else {

                while( !st.isEmpty() && st.peek() != '(' &&
                (prec(st.peek()) > prec(c) ||
                (prec(st.peek()) == prec(c) && !isRightAssociative(c)))){
                    res.append(st.pop());
                }
                st.push(c);
            }
        }
        // pop remaining operators
        while( !st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();

    }

    public static void main(String[] args) {
        String exp = "a*(b+c)/d";

    }
}
