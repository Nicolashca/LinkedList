package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.print();
        System.out.println();
        list.removeFirst();
        list.removeLast();
        list.removeByIndex(1);
        list.print();



        }
    }
