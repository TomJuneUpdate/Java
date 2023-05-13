package hus.oop.lab6.person;

public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" + "name='" + name + '\'' + ", address='" + address + '\'' + ']';
    }
}
