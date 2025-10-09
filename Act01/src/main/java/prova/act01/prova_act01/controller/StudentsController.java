package prova.act01.prova_act01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class StudentsController {
    @GetMapping("/student")
    public String getMethodName() {
        return "End Point del get";
    }
    @PostMapping("/students/batch")
    public String postMethodName() {
        return "End Point del post de Students";
    }
    
    
}
