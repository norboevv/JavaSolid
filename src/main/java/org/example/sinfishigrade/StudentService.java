package org.example.sinfishigrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added.");
    }

    public Optional<Student> getStudent(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public void updateStudent(String name, double newGrade) {
        getStudent(name).ifPresent(student -> {
            students.remove(student);
            students.add(new Student(name, newGrade));
            System.out.println(name + "'s grade updated to " + newGrade);
        });
    }

    public void deleteStudent(String name) {
        getStudent(name).ifPresent(student -> {
            students.remove(student);
            System.out.println(name + " deleted.");
        });
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void showTop5Students() {
        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .limit(5)
                .forEach(System.out::println);
    }
}
