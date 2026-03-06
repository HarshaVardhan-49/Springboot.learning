package com.harshh.StudentAPI;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class StudentServices {
    public List<String> getStudents(){
        List<String> students = new ArrayList<>();
        students.add("Harsha");
        students.add("junnu");
        students.add("vamsi");
        return students;
    }
}
