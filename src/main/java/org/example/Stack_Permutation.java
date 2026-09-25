package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Permutation {
    public static boolean validateOutput(int[] a, int[] b){

        Queue<Integer>q1 = new LinkedList<>();
        for(int i = 0; i < a.length;i++){
            q1.add(a[i]);
        }

        Queue<Integer>q2 = new LinkedList<>();
        for(int i = 0 ; i < b.length; i++){
            q2.add(b[i]);
        }

        Stack<Integer>st = new Stack<>();

        while(!q1.isEmpty()){
            int ele = q1.poll();

            if(ele == q2.peek()){
                q2.poll();

                while(!q2.isEmpty() && !st.isEmpty() && st.peek() == q2.peek()){
                    st.pop();
                    q2.poll();
                }
            }else {
                st.push(ele);
            }
        }
        return q2.isEmpty();
    }
    public static void main(String[] args) {

        int[] a = { 1,2,3 };
        int[] b = { 3,2,1 };

        if(validateOutput(a,b)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
