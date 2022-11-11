package com.linkedlist;
public class DeleteLinkedListElement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head =null;
    Node tail =null;
    static int position;

    //adding to linked list
    public void addToLinkedList(int data){
        Node newNode= new Node(data);
        if(head == null){
            head =newNode;
        }else
        {
            tail.next=newNode;
            newNode.next=null;
        }
        tail = newNode;
    }
    //delete The last element in linked list
    public void pop() {
        if (head == null) {
            System.out.println(" list is empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }
                //delete last element in linked list
    public void popLast(){
        if (head == null){
            System.out.println("List is empty");
            }
        else {
            if (head !=tail){
                Node current = head;
                while (current.next.next !=null){
                    current=current.next;
                }
                tail =current;
                tail.next=null;
            }
            else
            {
                head  =tail=null;
            }
        }
    }
//delete node at given index
    public void popNodeAtGivenIndex(int index){
        //case when we need to remove th tail node
        if (index ==1){
            pop();
        }
        else if (index == getLinkedlistSize())
        {
            popLast();
        }
        else {
            int count =1;
            Node current =head;
            while (current !=null && count !=index){
                current=current.next;
                count++;
            }
            current.next=current.next.next;
        }
    }
    //getting linked list size
    public int getLinkedlistSize(){
        Node currnet = head;
        int count =0;
        while (currnet !=null){
            currnet =currnet.next;
            count++;
        }
        return count;
    }
    //print linked list
    public void printLinkedList(){
        Node current = head;
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (current !=null){
            System.out.println(current.data+ "");
            current=current.next;
        }
    }
    public static void main(String [] args){
        System.out.println("Welcome to Linked list Program ");
        DeleteLinkedListElement linkedList=new DeleteLinkedListElement();
        System.out.println(" linked list");
        linkedList.addToLinkedList(56);
        linkedList.addToLinkedList(30);
        linkedList.addToLinkedList(70);
        linkedList.printLinkedList();
        System.out.println();
        linkedList.popLast();
        System.out.println(" After deleting last element ");
        System.out.println(" linked list");
        linkedList.printLinkedList();
        linkedList.popNodeAtGivenIndex(position);
        System.out.println("\nAfter removing40 from linked list");
        linkedList.printLinkedList();
    }
}
