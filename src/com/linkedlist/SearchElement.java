package com.linkedlist;

public class SearchElement {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    //adding to linked list
    public void addToLinkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
        }
        tail = newNode;
    }

    //search the linked list to find particular node
    public void checkNode(int value) {
        Node current = head;
        int count = 1;
        while (current != null) {
            if (current.data == value) {
                System.out.println("Searched  key: " +value + " is present at node : " + count);
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Searched key is not present in the linked list");
    }

    //print linkedList
    public void printLinkedList() {
        Node current = head;
        if (head == null) {
                System.out.println("Linked list is empty");
                return;
            }
            while (current != null) {
                System.out.println(current.data + "");
                current = current.next;
            }
        }
        public static void main (String[]args)
        {
            System.out.println("...............................");
            System.out.println("Welcome to Linked list Program ");
            System.out.println("...............................");
            SearchElement linkedList = new SearchElement();
            linkedList.addToLinkedList(56);     //56 is added first
            linkedList.addToLinkedList(30);     //30 is added after 56
            linkedList.addToLinkedList(70);     //70 is added after 30
            linkedList.printLinkedList();
            System.out.println();
            linkedList.checkNode(70);
        }
    }
