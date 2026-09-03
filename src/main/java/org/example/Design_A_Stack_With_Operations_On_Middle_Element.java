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
            return stack.remove(stack.size()-1);
        }

        // find middle operation
        int middle(){
            if(stack.isEmpty()){
                return -1;
            }
            return stack.get(stack.size()/2);
        }

        //  remove the middle element
        void removeMiddle(){
            if(stack.isEmpty()){
                return;
            }
            stack.remove(stack.size()/2);
        }

    }
    public static void main(String[] args) {


        myStack st = new myStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.middle());

        st.removeMiddle();

        System.out.println(st.middle());

        System.out.println(st.pop());
    }
}
