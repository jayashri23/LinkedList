package com.linkedlist;

public class SimpleLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    AddLinkedList.Node head = null;
    AddLinkedList.Node tail = null;

    //adding to linked list
    public void addToLinkedList(int data) {
        AddLinkedList.Node newNode = new AddLinkedList.Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else
        {
            newNode.next = head;
            head= newNode;
            tail.next = null;
            tail.next = newNode;
            newNode.next = null;
        }
        tail= newNode;
    }
    //print linkedList
    public void printLinkedList ()
    {
        AddLinkedList.Node current = head;
        while (current != null)
        {
            System.out.println(current.data + "");
            current = current.next;
        }
    }
    public static void main (String[] args)
    {
        System.out.println("...............................");
        System.out.println("Welcome to Linked list Program ");
        System.out.println("...............................");
        LinkedList linkedList = new LinkedList();
        linkedList.addToLinkedList(56);  //56 is added first
        linkedList.addToLinkedList(30);  //30 is added after 56
        linkedList.addToLinkedList(70);     //70 is added after 30
        linkedList.printLinkedList();
    }
}





