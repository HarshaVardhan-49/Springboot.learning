package com.harshh.StudentAPI;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class StudentServices {
    private List<Student> students = new ArrayList<>(
        List.of(
                new Student(101, "harsha",19),
                new Student(102,"Junnu",10),
                new Student(103,"vamsi",24),
                new Student(105,"mahesh",28)
        )
    );

    public List<Student> getStudents(){
        return students;
    }

    public Student getStudentId(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);

    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public String deleteStudent(int id) {
        students.removeIf(s -> s.getId()==id);
        return "Student" + id +"deleted";
    }
}
