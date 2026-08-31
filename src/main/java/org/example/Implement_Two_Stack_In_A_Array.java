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

    public static void main(String[] args) {

    }
}
