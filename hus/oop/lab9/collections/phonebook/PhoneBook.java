package hus.oop.lab9.collections.phonebook;

public interface PhoneBook {
    Student searchByLastname(String lastName);
    Student searchByNumber(String id);
    void addPerson(Student student);
    Student searchByName(String name);
    void deleteByNumber(String id);
}
