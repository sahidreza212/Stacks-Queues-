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
                DQueNode temp = new DQueNode();
                while(temp != null){
                    System.out.println(temp.value+" ");
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


    }
    public static void main(String[] args) {

    }
}
