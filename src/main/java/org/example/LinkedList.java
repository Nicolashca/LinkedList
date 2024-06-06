package org.example;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;

    }


    public static class Node {
        public int num;
        public Node next;
        public Node prev;

        public Node(int num) {
            this.num = num;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int num) {
        Node temp = new Node(num);

        if (isEmpty()){
            first = temp;
            last = temp;
        }
        else
        first.prev = temp;
        temp.next = first;
        first = temp;
    }

    public void addLast(int num) {
        Node temp = new Node(num);
        if (isEmpty())
            first = temp;
        else
            last.next = temp;
        temp.prev = last;
        last = temp;
    }

    public void removeFirst() {
        Node temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
            first = first.next;
        }
    }

    public void removeLast() {
        if (first.next == null)
            first = null;

        else {
            last.prev.next = null;

            last = last.prev;
        }
    }


    public void removeByIndex(int index) {
        Node cur = first;
        int c = 0;

        while (cur != null && c != index) {
            cur = cur.next;
            c++;
        }
        if (cur == first)
            removeFirst();
        else
            cur.prev.next = cur.next;


        if (cur == last)
            removeLast();
        else
            cur.next.prev = cur.prev;
    }


    public void print() {
        Node temp = first;

        while (temp != null) {
            System.out.println(temp.num);
            temp = temp.next;
        }
    }


}