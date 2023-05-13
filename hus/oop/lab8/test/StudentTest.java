package hus.oop.lab8.test;

import java.util.*;

public class StudentTest {
    public static void change(Student st, int number) {
        st.age = number;
    }

    public static void change(Student st) {
        Student student = new Student(st.name, 13);
        st = student;
        System.out.println(st);
    }
    // khi thay đổi địa chỉ phạm vi hoạt động chỉ trong block
    // Trong java địa chỉ của biến được sao chép truyền vào

    public static void main(String[] args) {
        Human student1 = new Student("ha", 3, 3.1);
        System.out.println(student1);
        ((Student) student1).speak();
        change((Student) student1);// không làm thay đổi student1
        System.out.println(student1);
        Human student2 = new Student("Qu", 23);
        student1 = student2;// phạm vi gán địa chỉ student2 cho biến student 1 trong block này
        System.out.println(student1.getGpa());

        List<Human> list = new LinkedList<>();
        list.add(new Student("jena",32));
        list.add(new Student("han",12));
        List<Human> list1 = new LinkedList<>(list);

        list1.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.age- o2.age;
            }
        });

        System.out.println(list);
        System.out.println(list1);

        List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 5);

// Tạo một list mới với các phần tử của originalList
        List<Integer> newList = new ArrayList<>();
        newList.addAll(originalList);
        newList.add(0, 45);
        System.out.println(newList);
        System.out.println(originalList);


    }
}
