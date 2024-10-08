package com.Hemantsah._9.LinkedList;

public class _3_CircularLL {
    private Node head;
    private Node tail;
    private int size;

    public _3_CircularLL() {
        this.size=0;
    }
    public void insertFirst(int val){ //O(1)
        Node node = new Node(val);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){ //O(1)

        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next=node;
        tail=node;
        tail.next=head;
        size+=1;
    }
    public void insert(int val, int position){ //O(n)
        if(position == 1){
            insertFirst(val);
            return;
        }
        if(position == size+1){
            insertLast(val);
            return;
        }
        Node temp = head;
        while(position>2){
            temp=temp.next;
            position--;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public Node get(int index){ //O(n)
        Node temp=head;
        while(index>0){
            temp=temp.next;
            index--;
        }
        return temp; //for any index it will return refrence pointer to that node.
    }
    public int deleteFirst(){ //O(1)
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){ //O(n)
        if(size<=1){
            return deleteFirst();
        }
        int val=tail.val;
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=head;
        size--;
        return val;
    }
    public int delete(int position){  //O(n)
        if(position==1){
            return deleteFirst();
        }
        if(position==size){
            return deleteLast();
        }
        Node prev = get(position-2);
        int val=prev.next.val;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    public Node findNode(int value){  //O(n)
        Node temp=head;
        while(temp!=null){
            if(temp.val==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display() { //O(n)
        Node temp = head;
        if(head!=null){
        do {
            System.out.println(temp.val);
            temp = temp.next;
        } while (temp != head);
        }
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {

            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
