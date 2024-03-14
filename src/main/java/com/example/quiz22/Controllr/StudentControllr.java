package com.example.quiz22.Controllr;

import com.example.quiz22.Api.ApiRespones;
import com.example.quiz22.Model.Student;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.websocket.server.PathParam;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.security.AllPermission;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/st")
public class StudentControllr {
    ArrayList<Student>students=new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Student> getStudents(){
        return students;
    }
    @PostMapping("/add")
    public ApiRespones addStudent(@RequestBody Student student){
        students.add(student);
        return new ApiRespones("added");
    }
    @PutMapping("/update/{id}")
    public ApiRespones upstudent(@RequestBody Student student, @PathVariable int id){
        students.set(id);
        return new ApiRespones("Update");
    }
    @DeleteMapping("delete")
    public ApiRespones deleteSt(Student student){
        students.remove(student);
        return new ApiRespones("Delete");
    }
}