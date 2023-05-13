package hus.oop.lab9.collections.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        MyLinkedListNode newNode = new MyLinkedListNode(o);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            add(o);
            return;
        }

        MyLinkedListNode newNode = new MyLinkedListNode(o);
        MyLinkedListNode previousNode = getNodeByIndex(index);
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index);
            MyLinkedListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
        }

        size--;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return getNodeByIndex(index).getPayload();
    }

    @Override
    public int size() {
        return size;
    }
}
