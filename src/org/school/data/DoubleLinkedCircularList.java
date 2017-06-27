package org.school.data;

import com.sun.tools.javac.util.Assert;

public class DoubleLinkedCircularList {
    private Node head = null;
    private Node tail = null;

    DoubleLinkedCircularList(int val) {
        head = new Node(val);
        head.next = head;
        head.previous = head;
        tail = head;
    }

    public Node add(int val) {
        //if list empty, we got head
        if (head == null) {
            head = new Node(val);
            head.next = head;
            head.previous = head;
            tail = head;
        } else {
            Node n = new Node(val);
            n.previous = tail;
            n.next = head;
            tail.next = n;
            tail = n;
        }
        return tail;
    }

    public int getTail() {
        return tail.value;
    }

    public int getHead() {
        return head.value;
    }

    public void insertAfter(Node n, int val) {
        Node newNode = new Node(val);
        newNode.next = n.next;
        newNode.previous = n;
        n.next = newNode;
    }

    //TODO check for nulls
    public void deleteNode(Node n) {
        if (head == n) {
            head = head.next;
        }
        if (tail == n) {
            tail = n.previous;
        }
        if (n.previous != null) {
            n.previous.next = n.next;
        }
        if (n.next != null) {
            n.next.previous = n.previous;
        }
    }

    public void printList() {
        Node n = head;
        do {
            System.out.print(n.value + " ");
            n = n.next;
        }
        while (n != head);
        System.out.println();
    }


    public static void main(String[] args) {
        DoubleLinkedCircularList doubleLinkedList = new DoubleLinkedCircularList(0);
        doubleLinkedList.add(1);
        Node myNode = doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        Node tail = doubleLinkedList.add(4);
        System.out.println(doubleLinkedList.getHead());
        System.out.println(doubleLinkedList.getTail());
        doubleLinkedList.printList();
        System.out.println("Before insertion:");
        System.out.println(myNode.previous.value);
        System.out.println(myNode.next.value);
        doubleLinkedList.insertAfter(myNode, 69);
        System.out.println("tail: " + doubleLinkedList.getTail());
        doubleLinkedList.printList();
        System.out.println(myNode.previous.value);
        System.out.println(myNode.next.value);
        doubleLinkedList.deleteNode(myNode);
        //after delete
        doubleLinkedList.printList();
        //delete tail
        doubleLinkedList.deleteNode(tail);
        doubleLinkedList.printList();
        Assert.check(doubleLinkedList.tail.next.value == doubleLinkedList.getHead());
        System.out.println("Is it circle: " + doubleLinkedList.tail.next.value);
    }
}
