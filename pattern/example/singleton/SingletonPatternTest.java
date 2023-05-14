package pattern.example.singleton;

public class SingletonPatternTest {
    public static void main(String[] args) {
        StudentManager studentManager = StudentManager.getInstance();
        studentManager.addStudent(new Student("Jena",299,"37 LTN"));
        studentManager.addStudent(new Student("Jorn",299,"37 ADV"));
        StudentManager studentManager2 = StudentManager.getInstance();
        System.out.println(studentManager.getStudentList());
        System.out.println(studentManager2==studentManager);
    }
}
