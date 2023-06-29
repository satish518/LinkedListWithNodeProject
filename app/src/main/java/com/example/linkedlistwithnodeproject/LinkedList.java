package com.example.linkedlistwithnodeproject;

public class LinkedList {
    private Node start;
    private int size;

    public LinkedList() {
    }

    public boolean isEmpty() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertAtStart(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;

    }

    public void insertAtEnd(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = start;
        if (t == null) {
            start =  n;
        } else {
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }

    public void insertAtPos(int val, int pos) {
        if (pos == 1) {
            insertAtStart(val);
        } else if (pos == size + 1) {
            insertAtEnd(val);
        } else if (pos > 1 && pos <= size){
            Node n, t;
            n = new Node(val, null);
            t = start;

            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;

        } else {
            System.out.println("Insertion not possible at position " + pos);
        }

    }

    public void deleteStart() {
        if (start == null) {
            System.out.println("List is already empty");
        } else {
            start = start.getNext();
            size--;
        }

    }

    public void deleteEnd() {
        if (start == null) {
            System.out.println("List is already empty");
        } else if (size == 1) {
            start = null;
            size--;
        } else {
            Node t;
            t = start;
            for (int i = 1; i < size - 1; i++) {
                t = t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void deleteAtPos(int pos) {
        if (start == null) {
            System.out.println("List is already empty");
        } else if (pos < 1 || pos > size) {
            System.out.println("Invalid Position");
        } else if (pos == 1) {
            deleteStart();
        } else if (pos == size) {
            deleteEnd();
        } else {
            Node t, t1;
            t = start;
            for (int i = 1; i < pos-1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;

        }
    }

    public int getListSize() {
        return size;
    }

    public void viewList() {
        Node t;
        if (isEmpty()) {
            System.out.println("List is Empty");
            // System.out.println(start.getData());
        } else {
            t = start;
            for (int i = 1; i <= size; i++) {
                System.out.print(" " + t.getData() + " ");
                t = t.getNext();
            }
        }
    }
}