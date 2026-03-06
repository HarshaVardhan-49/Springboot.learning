package com.harshh.StudentAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
     StudentServices studentServices;

     public StudentController(StudentServices studentServices){
         this.studentServices = studentServices;
     }

     @GetMapping("/students")
    public List<String> getStudents(){
         return studentServices.getStudents();
     }

}
