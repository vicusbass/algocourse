package org.school.data;

import com.sun.tools.javac.util.Assert;

public class DoubleLinkedCircularSentinelList {
    Node sentinel = null;
    Node current = null;

    DoubleLinkedCircularSentinelList() {
        sentinel = new Node(null);
        sentinel.next = sentinel.previous = sentinel;
        current = sentinel;
    }

    public Node add(int val) {
        Node n = new Node(val);
        n.previous = current;
        n.next = current.next;
        current.next.previous = n;
        current.next = n;
        current = n;
        return n;
    }

    public Node getTail() {
        return sentinel.previous;
    }

    public Node getHead() {
        return sentinel.next;
    }


    public void printList() {
        Node n = sentinel;
        do {
            System.out.print(n.value + " ");
            n = n.next;
        }
        while (n != sentinel);
        System.out.println();
    }

    public boolean contains(Node n) {
        Node tmpNode = sentinel;
        do {
            if (tmpNode == n) return true;
            tmpNode = tmpNode.next;
        } while (tmpNode != sentinel);
        return false;
    }


    public static void main(String[] args) {
        DoubleLinkedCircularSentinelList doubleLinkedList = new DoubleLinkedCircularSentinelList();
        doubleLinkedList.add(0);
        doubleLinkedList.add(1);
        Node myNode = doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        Node tail = doubleLinkedList.add(4);
        System.out.println(doubleLinkedList.getHead().value);
        System.out.println(doubleLinkedList.getTail().value);
        doubleLinkedList.printList();

        Assert.check(doubleLinkedList.getTail().next == doubleLinkedList.sentinel);
        System.out.println(doubleLinkedList.contains(myNode));
        System.out.println(doubleLinkedList.contains(tail));
        System.out.println(doubleLinkedList.contains(new Node(8)));
    }
}
