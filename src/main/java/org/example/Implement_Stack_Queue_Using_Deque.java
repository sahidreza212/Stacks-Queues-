package org.example;

public class Implement_Stack_Queue_Using_Deque {

    // create the deque node
    static  class DQueNode{
        int value;
        DQueNode prev;
        DQueNode next;
    }

    // create deque class
    static class deque {

        private DQueNode head;
        private DQueNode tail;

        // constructor
        public deque() {
            head = tail = null;
        }

        // list is empty or not
        boolean isEmpty() {
            if(head == null){
                return true;
            }
            return false;
        }

        // size function
        int size(){
            if(!isEmpty()){
                DQueNode temp = head;
                int len = 0;

                while(temp != null){
                    len++;
                    temp = temp.next;
                }
                return len;
            }
            return 0;
        }
        // insert at first element
        void insert_first(int element){

            // Allocate the node of DQueNode type
            DQueNode temp = new DQueNode();
            temp.value = element;

            if(head == null){
                head = tail = temp;
                temp.prev = temp.next = null;
            }else {
                head.prev = temp;
                temp.next = head;
                temp.prev = null;
                head = temp;
            }
        }

        // insert_last
        void insert_last(int element){

            // Allocate the node of DQueNode type
            DQueNode temp = new DQueNode();
            temp.value = element;

            if(head == null){
                head = tail = temp;
                temp.prev = temp.next = null;
            }else {
                tail.next = temp;
                temp.next = null;
                temp.prev = tail;
                tail = temp;
            }
        }

        // remove_first
        public void remove_first(){
            if(!isEmpty()){
                if(head == tail){
                    head = tail = null;
                }else {
                    head = head.next;
                    head.prev = null;
                }
            }else {
                System.out.println("List is Empty");
            }
        }

        // remove_last
        public void remove_last(){
            if(!isEmpty()){
                if(head == tail){
                    head = tail = null;
                }else {
                    tail = tail.prev;
                    tail.next = null;
                }
            }else {
                System.out.println("List is Empty");
            }
        }

        // display all element
        public void display(){
            if(!isEmpty()){
                DQueNode temp = head;
                while(temp != null){
                    System.out.print(temp.value+" ");
                    temp = temp.next;
                }
            }else {
                System.out.println("List is Empty");
            }
        }
    }

    static class Stack{

        deque d = new deque();

        public void push(int x){
            d.insert_last(x);
        }
        public int size(){
          return d.size();
        }
        public void pop(){
            d.remove_last();
        }
        public void display(){
            d.display();
        }
    }


    static  class Queue{

        deque d = new deque();

        public void enqueue(int x){
            d.insert_last(x);
        }
        public void dequeue(){
            d.remove_first();
        }
        public int size(){
            return d.size();
        }
        public void display(){
            d.display();
        }

    }
    public static void main(String[] args) {

        // Object of Stack
        Stack stk = new Stack();

        // push 7 and 8 at top of stack
        stk.push(7);
        stk.push(8);
        System.out.print("Stack: ");
        stk.display();


        // For new line
        System.out.println();

        // pop an element
        stk.pop();
        System.out.print("Stack: ");
        stk.display();

        // For new line
        System.out.println();

        // Object of Queue
        Queue que = new Queue();

        // Insert 12 and 13 in queue
        que.enqueue(12);
        que.enqueue(13);
        System.out.print("Queue: ");
        que.display();

        // New line
        System.out.println();

        // Delete an element from queue
        que.dequeue();
        System.out.print("Queue: ");
        que.display();

        // New line
        System.out.println();
        System.out.println("Size of stack is "
                + stk.size());
        System.out.println("Size of queue is "
                + que.size());
    }
}
