package org.example;

public class Implement_Stack_Queue_Using_Deque {

    // create the deque node
    static  class DQueNode{
        int value;
        DQueNode prev;
        DQueNode next;
    }

    // create deque class
    static class deque{
        private DQueNode head;
        private DQueNode tail;

        // constructor
        public deque(){
            head = tail = null;
        }
    }
    public static void main(String[] args) {

    }
}
