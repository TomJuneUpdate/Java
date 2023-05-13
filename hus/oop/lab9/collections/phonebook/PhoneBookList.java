package hus.oop.lab9.collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    protected ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    public PhoneBookList(ArrayList<Student> phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public Student searchByLastname(String lastName) {
        for (Student student : phoneBook) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String id) {
        for (Student student : phoneBook) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        this.phoneBook.add(student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if ((student.getFirstName() + " " + student.getLastName()).equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String id) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getId().equals(id)) {
                phoneBook.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("PhoneBookList: ");
        for (Student student : phoneBook) {
            str.append(student.toString());
            str.append(" ");
        }

        return str.toString();
    }
}
