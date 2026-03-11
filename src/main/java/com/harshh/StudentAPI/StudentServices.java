package com.harshh.StudentAPI;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class StudentServices {
    private List<String> students = new ArrayList<>(
        List.of("Harsha","Junnu","vamsi")
    );

    public List<String> getStudents(){
        return students;
    }

    public String getStudentId(int id) {
        if(id < 0 || id >= students.size()) return "Student not found";
        return students.get(id);
    }

    public String addStudent(String name) {
        students.add(name);
        return name + "succesfull added";
    }

    public String deleteStudentId(int id) {
        if(id < 0 || id >= students.size()) return "Student not found";
        String removed = students.get(id);
        students.remove(id);
        return removed + "removed Succesfully";
    }
}
