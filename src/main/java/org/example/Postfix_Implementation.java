package org.example;

public class Postfix_Implementation {

    public static int floorDiv(int a , int b){
        if((a*b) < 0 && a % b != 0){
            return (a/b)-1;
        }
        return a/b;
    }
    public static void main(String[] args) {

    }
}
