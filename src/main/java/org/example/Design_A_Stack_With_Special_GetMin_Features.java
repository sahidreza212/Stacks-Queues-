package org.example;

import java.util.Stack;

public class Design_A_Stack_With_Special_GetMin_Features {
    Stack<Integer>stack = new Stack<>();
    int min;

    void push(int x){

        // if the stack is empty
        if(stack.isEmpty()){
            stack.push(x);
            min = x;
        }
        // if x is smaller than the min
        else if( x < min) {
            stack.push(2*x-min);
            min = x;
        }
        // normal push
        else {
            stack.push(x);
        }
    }

    int pop(){
        if(stack.isEmpty()){
            return -1;
        }
        int top = stack.pop();
        // if the top is encoded value
        if(top < min){
            int oldMin = min;
            min = 2 * min - top;
            return oldMin;
        }
        return top;
    }

    int getMin(){
        if(stack.isEmpty()){
            return -1;
        }
        return min;
    }



    public static void main(String[] args) {

    }
}
