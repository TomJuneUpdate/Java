package hus.oop.lab9.collections.phonebook;

public class TestApp {
    public static void main(String[] args) {
        Student student1 = new Student("34567", "A", "A", 2002);
        Student student2 = new Student("23434", "B", "B", 2001);

        // Test PhoneBookList
        PhoneBook phoneBook = new PhoneBookList();
        phoneBook.addPerson(student1);
        phoneBook.addPerson(student2);
        test(phoneBook);

        // Test PhoneBookMap
        phoneBook = new PhoneBookMap();
        phoneBook.addPerson(student1);
        phoneBook.addPerson(student2);
        test(phoneBook);

    }

    public static void test(PhoneBook phoneBook) {

        System.out.println(phoneBook);
        System.out.println(phoneBook.searchByLastname("A"));
        System.out.println(phoneBook.searchByName("B B"));
        System.out.println(phoneBook.searchByNumber("2"));
        phoneBook.deleteByNumber("2");
        System.out.println(phoneBook);
    }
}
