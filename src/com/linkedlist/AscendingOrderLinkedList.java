package com.linkedlist;

public class AscendingOrderLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data ){
            this.data=data;
            this.next=null;
        }
    }
    Node head =null;
    Node tail = null;
    static int position;

    //add linked list
    public void addToLinkedList(int data){
        Node newNode =new Node(data);
        if (head == null){
            head =newNode;
        }
        else {
            tail.next=newNode;
            newNode.next=null;
        }
        tail =newNode;
    }
    //sorted linked list
    public void sortLinkedList() {

        Node currents = head, index=null;
        int temp;
        while (currents != null)
        {
                if (head == null) {
                    return;
                } else {
                    index = currents.next;
                    while (index != null) {
                        if (currents.data > index.data) {
                            temp = currents.data;
                            currents.data = index.data;
                            index.data = temp;
                        }
                        index = index.next;
                        currents = currents.next;
                    }
                    currents =currents.next;
                }
            }
        }
                //print linked list
                public void printLinkedList () {
                    Node current = head;
                    if (head == null) {
                        System.out.println("Linked Lise is empty");
                        return;
                    }
                    while (current != null) {
                        System.out.println(current.data + "");
                        current = current.next;

                    }
                }
                            public static void main(String [] args){

                            AscendingOrderLinkedList linkedList=new AscendingOrderLinkedList();
                            linkedList.addToLinkedList(56);
                            linkedList.addToLinkedList(30);
                            linkedList.addToLinkedList(40);
                            linkedList.addToLinkedList(70);
                            System.out.println("Before sorting the Linked list");
                            linkedList.printLinkedList();
                            System.out.println();
                            linkedList.sortLinkedList();
                            System.out.println("After sorting Linked List ");
                            linkedList.printLinkedList();

                    }
                }


