package com.harshh.StudentAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
     StudentServices studentServices;

     public StudentController(StudentServices studentServices){
         this.studentServices = studentServices;
     }
     @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
         return ResponseEntity.ok(studentServices.getStudents());
     }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentServices.getStudentId(id);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(studentServices.addStudent(student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        return ResponseEntity.ok(studentServices.deleteStudent(id));
    }

}
