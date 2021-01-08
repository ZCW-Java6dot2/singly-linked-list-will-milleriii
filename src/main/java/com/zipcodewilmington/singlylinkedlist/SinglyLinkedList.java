package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){
        first = null;
    }

    public Boolean isEmpty(){
        return (first == null);
    }

    //insert at beginning of list
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    //delete from beginning of list
    public Node deleteFirst(){
        Node temp = new Node();
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data){
        Node current = first;
        while (current.next != null){
            current = current.next; //loop until current == null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

}
