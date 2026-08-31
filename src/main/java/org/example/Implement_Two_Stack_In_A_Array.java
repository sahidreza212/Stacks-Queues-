package org.example;

public class Implement_Two_Stack_In_A_Array {
    int arr[];
    int size;
    int mid;
    int top1, top2;

    public Implement_Two_Stack_In_A_Array(int n) {
        size = n;
        arr = new int[n];
        mid = size/2;
        top1 = -1;
        top2 = mid-1;
    }

    void push1(int x){
        if(top1 == mid-1){
            // stack  full and overflow;
            return;
        }else {
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x){
        if(top2 == size-1){
            // stack full and overflow
            return;
        }else {
            top2++;
            arr[top2] = x;
        }
    }

    int pop1(){
        if(top1 == -1){
            // stack is empty and underflow
            return -1;
        }else {
            int ele = arr[top1];
            top1--;
            return ele;
        }
    }

    int pop2(){
        if(top2 == mid-1){
            // stack2 is empty and underflow
            return -1;
        }else {
            int ele = arr[top2];
            top2--;
            return ele;
        }
    }

    public static void main(String[] args) {

    }
}
