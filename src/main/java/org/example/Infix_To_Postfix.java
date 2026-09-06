package org.example;

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

    }

    public static void main(String[] args) {
        String exp = "a*(b+c)/d";

    }
}
