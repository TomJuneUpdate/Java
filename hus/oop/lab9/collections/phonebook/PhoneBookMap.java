package hus.oop.lab9.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public PhoneBookMap(HashMap<String, Student> phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public Student searchByLastname(String lastName) {
        for (Student student : phoneBook.values()) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String id) {
        for (String number : phoneBook.keySet()) {
            if (number.equals(id)) {
                return phoneBook.get(number);
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.put(student.getId(), student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if ((student.getFirstName() + " " + student.getLastName()).equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String id) {
        for (String number : phoneBook.keySet()) {
            if (number.equals(id)) {
                this.phoneBook.remove(number);
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("PhoneBookMap: ");
        for (Student student : phoneBook.values()) {
            str.append(student.toString());
            str.append(", ");
        }
        return str.toString();
    }
}