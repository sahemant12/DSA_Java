package com.Hemantsah._9.LinkedList;

public class _10_LinkedListPractice {
}
class SinglyLinkedList{
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int value){
    Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        //using tail
//        Node node = new Node(value);
//        node.next = null;
//        tail.next = node;
//        tail = node;
//        size+=1;

        //w/o tail
        Node node = new Node(value);
        node.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        tail=node;
        size+=1;
    }

    public void insertBetween(int value, int position){
        if(position==1){
            insertFirst(value);
            return;
        }
        if(position==size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node preNode = getPreNode(position);
        Node temp = preNode.next;
        preNode.next = node;
        node.next = temp;
        size+=1;
    }
    public Node getPreNode(int position){
        Node temp = head;
        while(position>1){
            temp=temp.next;
            position--;
        }
        return temp;
    }



    public int deleteFirst(){
        if(head==null){
            return -1;
        }
        int val = head.value;
       Node temp = head;
       head = head.next;
       temp.next = null;
        size-=1;
        if(head==null){
            tail=null;
        }
        return val;
    }
    public int deleteLast(){
      if(head==null){
          return -1;
      }
      Node temp = head;
      while(temp.next.next!=null){
          temp=temp.next;
      }
      int val = temp.next.value;
      temp.next = null;
      tail = temp;
      size-=1;
      return val;
    }

    public int deleteBetween(int position){
        if(position==1){
            return deleteFirst();
        }
        if(position==size){
            return deleteLast();
        }
       Node preNode = getPreNode(position);
        Node temp = preNode.next;
        preNode.next = temp.next;
        int val = temp.value;
        temp.next = null;
        size-=1;
        return val;
    }

    public Node findNode(int val){
        Node temp = head;
        while(temp!=null){
            if(val==temp.value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //Insertion using Recursion: Perfect, it works
    public void insertionUsingRecursion(int value, int position){
        insertionUsingRecursion(value, position, head);
    }
    public void insertionUsingRecursion(int value, int position, Node node){
        if(node==null){
            return;
        }
        if(position==1){
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            size+=1;
            return;
        }
        if(position==2){
            Node newNode = new Node(value);
            newNode.next = node.next;
            node.next = newNode;
            size+=1;
            return;
        }
        insertionUsingRecursion(value, position-1, node.next);
    }
}
