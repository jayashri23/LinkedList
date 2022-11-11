package com.linkedlist;

public class AddBetween {
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
        //add the node in the middle
    public void addAfter(int value) {
        Node current = head;
        while (current != null ){
            if (!(current.data == 56)) {
                current = current.next;
            } else if (current.data == 56) {
                break;
            }
        }
        Node newNode = new Node(value);
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
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
        linkedList.addToLinkedList(56);   //add 56 first
        linkedList.addToLinkedList(30);    //30 add after 56
        linkedList.addToLinkedList(70);     //70 add after 30

        linkedList.printLinkedList();
    }
}


