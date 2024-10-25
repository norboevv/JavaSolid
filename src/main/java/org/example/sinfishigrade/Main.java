package org.example.sinfishigrade;
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(new Student("Ali", 85));
        studentService.addStudent(new Student("Vali", 92));
        studentService.addStudent(new Student("Qozi", 78));
        studentService.addStudent(new Student("G'ani", 95));
        studentService.addStudent(new Student("Eldor", 88));
        studentService.addStudent(new Student("Man", 65));
        studentService.addStudent(new Student("Akbar", 90));

        System.out.println("All Students:");
        studentService.getAllStudents().forEach(System.out::println);

        studentService.updateStudent("Ali", 90);

        studentService.deleteStudent("Man");

        System.out.println("\nTop 5 Student:");
        studentService.showTop5Students();
    }
}
