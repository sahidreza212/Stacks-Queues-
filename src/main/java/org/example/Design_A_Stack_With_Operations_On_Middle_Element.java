package org.example;

import java.util.ArrayList;

public class Design_A_Stack_With_Operations_On_Middle_Element {

    public static class myStack{

        // take the help of ArrayList to solve this problem
        ArrayList<Integer>stack = new ArrayList<>();

        // push operation
        void push(int x){
            stack.add(x);
        }

        // pop operation
        int pop(){
            if(stack.isEmpty()){
                return -1;
            }
            return stack.get(stack.size()-1);
        }

    }
    public static void main(String[] args) {


    }
}
