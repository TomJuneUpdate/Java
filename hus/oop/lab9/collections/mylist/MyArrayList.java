package hus.oop.lab9.collections.mylist;

public class MyArrayList extends MyAbstractList {
    private static final int INITIAL_SIZE = 16;
    Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size == elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;

    }

    @Override
    public void remove(int index) {
        checkBoundaties(index, this.size - 1);
        for (int i = index; i < this.size; i++) {
            elements[i] = elements[i + 1];
        }
        this.elements[size - 1] = null;
        size--;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaties(index, this.size - 1);
        if (this.size == elements.length) {
            enlarge();
        }
        for (int i = this.size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
    }

    @Override
    public Object get(int index) {
//        if(index < 0 || index >=size)
//            throw new ArrayIndexOutOfBoundsException();
        checkBoundaties(index, size - 1);
        return this.elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    private void enlarge() {
        Object[] newData = new Object[elements.length * 2];
        //System.arraycopy(elements, 0, newData, 0, elements.length);
        for (int i = 0; i < elements.length; i++) {
            newData[i] = elements[i];
        }
        this.elements = newData;
    }
}
