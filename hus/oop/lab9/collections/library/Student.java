package hus.oop.lab9.collections.library;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private  String lastName;
    private String phone;
    private double average;

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public Student(String name, String lastName, String phone, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public int hashCode() {
        // cần hiểu về mã băm
        return Objects.hash(name,lastName,phone,average);
    }

    public static void main(String[] args) {
        Student student = new Student("Manh","Do","232",323);
        System.out.println(student.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null ||  getClass() != obj.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return Double.compare(student.average,average) == 0
                && Objects.equals(name,student.name)
                &&Objects.equals(lastName,student.lastName)
                &&Objects.equals(phone,student.phone);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                ']';
    }
}
