package com.student.management.studentController;

import com.student.management.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @GetMapping
    public ResponseEntity<Student> getStudent(){
        Student student=new Student(1,"Ashish","pathade");
        return ResponseEntity.ok(student);
    }
@GetMapping("students")
public ResponseEntity<List<Student>> getStudents(){
    List<Student> students=new ArrayList<>();
    students.add(new Student(1,"Ashish","Pathade"));
    students.add(new Student(2,"Ashish","Pathade"));
    students.add(new Student(3,"Ashish","Pathade"));
    return ResponseEntity.ok(students);
}
@GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathvariable(@PathVariable("id") int studentId,
                                                       @PathVariable("first-name") String firstname,@PathVariable("last-name") String lastname){
        Student student= new Student(studentId,firstname,lastname);
        return ResponseEntity.ok(student);
}
 @GetMapping("query")
    public ResponseEntity<Student> studentByQueryParam(@RequestParam int id,String firstName,String lastName){
        Student student=new Student(id,firstName,lastName);
        return ResponseEntity.ok(student);
 }
 @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
     System.out.println(student.getStudentId());
     System.out.println(student.getFirstname());
     System.out.println(student.getLastName());
    return ResponseEntity.status(HttpStatus.CREATED).body(student);
 }
 @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
       return ResponseEntity.ok(student);
 }
 @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
        return ResponseEntity.ok("student deleted successfully");
 }
}
