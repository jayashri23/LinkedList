package com.linkedlist;

public class InsertInLinkedListSequence {
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
    static  int position;

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
    //search
    public void checkoutNode(int value){
        Node current = head;
        int count =1;
        while (current != null){
            if (current.data == value){
              //  System.out.println("Searched key :" +value+ "is present at node :" +count);
                position = count;
                return;
            }
            current=current.next;
            count++;
        }
        System.out.println("Searched key is not present in the linked list");
    }
        //add the node in the middle
    public void addAfter(int value ,int index) {
        Node current = head;
        int count =1;
        while (current != null && count != index ){    //list start from 0 so 30 position is 1 and this index
            //represent 2 where 40 will be put
          current =current.next;
          count++;
        }
        Node newNode = new Node(value);
        assert current != null;
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }
    //print linked list
    public void printLinkedList(){
        Node current = head;
        if( head ==null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (current !=null){
            System.out.println(current.data+ "");
            current = current.next;
        }
    }
    public static void main(String [] args){
        System.out.println("Welcome to Linked list Program ");
        InsertInLinkedListSequence linkedList=new InsertInLinkedListSequence();
        linkedList.addToLinkedList(56);   //add 56 first
        linkedList.addToLinkedList(30);    //30 add after 56
        linkedList.addToLinkedList(70);     //70 add after 30
        System.out.println("Before Adding 40 to the LinkedList");
        linkedList.printLinkedList();
        System.out.println();
        linkedList.checkoutNode(30);
        linkedList.addAfter(40,position);
        System.out.println("After adding 40 to  the linked list ");
        linkedList.printLinkedList();
    }
}


