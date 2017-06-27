package org.school.data;

public class SingleLinkedList {
    private Node head = null;
    private Node tail = null;

    SingleLinkedList(int val) {
        head = new Node(val);
        tail = head;
    }

    public Node add(int val) {
        //if list empty, we got head
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            Node n = new Node(val);
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
        Node tmpNode = head;
        while (tmpNode != null) {
            if (tmpNode == n) {
                Node newNode = new Node(val);
                newNode.next = tmpNode.next;
                tmpNode.next = newNode;
                return;
            } else {
                tmpNode = tmpNode.next;
            }
        }
    }

    public void deleteNode(Node n) {
        if (head == n) {
            head = head.next;
            return;
        }
        Node tmpNode = head;
        while (tmpNode != null) {
            if (tmpNode.next == n) {
                if (tmpNode.next == tail) {
                    tail = tmpNode;
                }
                tmpNode.next = tmpNode.next.next;
                return;
            } else tmpNode = tmpNode.next;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(0);
        singleLinkedList.add(1);
        Node myNode = singleLinkedList.add(2);
        singleLinkedList.add(3);
        Node tail = singleLinkedList.add(4);
        System.out.println(singleLinkedList.getHead());
        System.out.println(singleLinkedList.getTail());
        singleLinkedList.printList();
        singleLinkedList.insertAfter(myNode, 69);
        singleLinkedList.printList();
        singleLinkedList.deleteNode(myNode);
        //after delete
        singleLinkedList.printList();
        //delete tail
        singleLinkedList.deleteNode(tail);
        singleLinkedList.printList();
        System.out.println(singleLinkedList.getTail());
        singleLinkedList.add(100);
        System.out.println(singleLinkedList.getTail());
    }
}
