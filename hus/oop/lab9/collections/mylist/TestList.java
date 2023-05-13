package hus.oop.lab9.collections.mylist;

import hus.oop.lab9.collections.library.Student;

public class TestList {
    public static void main(String[] args) {
//        MyList myList = new MyArrayList();
//        myList.add(18);
//        myList.add("ss");
//        myList.add(2);
//        myList.add("ff",5);
//        System.out.println(myList.size());
//        myList.remove(3);
//        System.out.println(myList.get(5));
        Student student = new Student("d","d","d",3);
        MyList testLinked = new MyLinkedList();
        testLinked.add("dđ");
        testLinked.add("bn");
        testLinked.add(student);
        testLinked.add("a",2);
        System.out.println(testLinked);


    }
}
