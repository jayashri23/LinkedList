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
            tail =newNode;
        }else
        {
            tail.next=newNode;
            newNode.next=null;
        }
        tail = newNode;
    }

    //delete The First element in linked list
    public void pop(){
        if (head == null){
            System.out.println(" list is empty");
            return;
        }
        else {
            if (head != null){
                head =head.next;
            }else {
                head=tail=null;
            }
        }
    }

    //print linked list
    public void printLinkedList(){
        Node current = head;
        while (current !=null){
            System.out.println(current.data+ "");
            current = current.next;
        }
    }
    public static void main(String [] args){
        System.out.println("Welcome to Linked list Program ");
        System.out.println("Linked list is");
        LinkedList linkedList=new LinkedList();
        linkedList.addToLinkedList(56);
        linkedList.addToLinkedList(30);
        linkedList.addToLinkedList(70);
        linkedList.printLinkedList();
        System.out.println();
        linkedList.pop();
        System.out.println("After removing first element from  linked list ");
        linkedList.printLinkedList();
    }
}
