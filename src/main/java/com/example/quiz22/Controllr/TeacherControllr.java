package com.example.quiz22.Controllr;

import com.example.quiz22.Api.ApiRespones;
import com.example.quiz22.Model.Student;
import com.example.quiz22.Model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherControllr {
    ArrayList<Teacher>teachers=new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }
    @PostMapping("/add")
    public ApiRespones addTeacher(@RequestBody Teacher teacher){
        teachers.add(teacher);
        return new ApiRespones("added");
    }
    @PutMapping("/update/{id}")
    public ApiRespones upstudent(@RequestBody Teacher teacher, @PathVariable int id){
        teachers.set(id);
        return new ApiRespones("Update");
    }
    @DeleteMapping("delete")
    public ApiRespones deleteSt(Teacher teacher){
        teachers.remove(teacher);
        return new ApiRespones("Delete");
    }
}