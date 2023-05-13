package hus.oop.lab8.test;

public class Student extends Human {
    double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int age) {
        super(age, name);
    }

    public Student(String name, int age, double gpa) {
        super(age, name);
        this.gpa = gpa;
    }
    public void speak(){
        System.out.println("Hahaha");
    }

    @Override
    public String changeName() {
        return null;
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}
