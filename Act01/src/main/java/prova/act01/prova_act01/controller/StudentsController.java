package prova.act01.prova_act01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import prova.act01.prova_act01.model.Student;
import prova.act01.prova_act01.repository.StudentRepository;



@RestController
@RequestMapping("/api")

public class StudentsController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudent() {

        return studentRepository.findAll();
    }

    @PostMapping("/students/batch")
    public String addStudent() {
        studentRepository.save("Carol", "Melguizo", 25, "DAM", 2);
        return "End Point de Students";
    }
    
    
}
