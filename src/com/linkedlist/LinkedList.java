package com.linkedlist;
public class LinkedList {
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
    public void popLast(){
        if (head == null){
            System.out.println(" list is empty");
        }
        else {
            if (head != tail){
                head =head.next;
                Node current = head;
                while (current.next.next != null)
                {
                    current =current.next;
                }
                tail =current;
                tail.next =null;
            }else
            {
                head=tail=null;
            }
        }
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
        LinkedList linkedList=new LinkedList();
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

    }
}
