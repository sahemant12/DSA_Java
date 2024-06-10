package com.Hemantsah._9.LinkedList;

public class _6_LL_setup_Node {
    private Node head;
    private Node tail;
    private int size;

    public _6_LL_setup_Node() {
        this.size = size;
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

        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        tail=node;
        size++;

    }

    public void display(){ //O(n)
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public Node findMid(){
        System.out.println(getMid(head).val);
        return getMid(head);
    }

    public Node getMid(Node head){
        Node midPrev=null;
        while(head!=null && head.next!=null) {
            midPrev = midPrev == null ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }

    public static _6_LL_setup_Node mergeLL(_6_LL_setup_Node list1, _6_LL_setup_Node list2){
        Node f =list1.head;
        Node s =list2.head;
        _6_LL_setup_Node mergeList = new _6_LL_setup_Node();

        while(f!=null && s!=null){
            if(f.val<=s.val){
                mergeList.insertLast(f.val);
                f=f.next;
            }else{
                mergeList.insertLast(s.val);
                s=s.next;
            }
        }
        while(f!=null){
            mergeList.insertLast(f.val);
            f=f.next;
        }
        while(s!=null){
            mergeList.insertLast(s.val);
            s=s.next;
        }
        return mergeList;
    }

    public void reverseLL(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = null;
        Node currNode = null;
        Node nextNode = head;
        while(nextNode!=null){
            currNode = nextNode;
            nextNode=nextNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
        }
        head=currNode;
    }

    public void reverseLLKunalKushwahaWay(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = head.next;
        while(currNode!=null){
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            if(nextNode!=null){
                nextNode=nextNode.next;
            }
        }
        head=prevNode;
    }

    public void helperReverseLLRcursive(){
        reverseLLRcursive(head);
    }
    public void reverseLLRcursive(Node temp){
        if(temp==tail){
            head=tail;
            return;
        }
        reverseLLRcursive(temp.next);
        tail.next=temp;
        tail=temp;
        tail.next=null;
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {

            this.val = val;
        }
        public Node(){}
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
