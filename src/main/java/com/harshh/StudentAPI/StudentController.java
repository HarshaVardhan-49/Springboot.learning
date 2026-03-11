package com.harshh.StudentAPI;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
     StudentServices studentServices;

     public StudentController(StudentServices studentServices){
         this.studentServices = studentServices;
     }
     // GET all studends (read)
     @GetMapping
    public List<String> getStudents(){
         return studentServices.getStudents();
     }
     // GET Students by ID (students/id)
     @GetMapping("/{id}")
    public String getStudentId(@PathVariable int id){
         return studentServices.getStudentId(id);
     }
    // Post Student nae (create student)
     @PostMapping
    public String addStudent(@RequestBody String name){
         return studentServices.addStudent(name);
     }
    // Delete student by id
     @DeleteMapping("/{id}")
    public String deleteStudentId(@PathVariable int id){
         return studentServices.deleteStudentId(id);
     }
}
