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
            tail = newNode;
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
        LinkedList linkedList=new LinkedList();
        linkedList.addToLinkedList(56);
        linkedList.addToLinkedList(30);
        linkedList.addToLinkedList(70);
        linkedList.printLinkedList();
    }
}
