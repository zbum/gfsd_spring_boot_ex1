package kr.co.manty.gfsd_spring_boot_ex1.student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{student-id}")
    public StudentResponse retrieveStudent(@PathVariable("student-id") Long id) {
        return StudentResponse.from(studentService.getStudent(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponse registerStudent(@RequestBody Student student) {
        studentService.registerStudent(student);
        return StudentResponse.from(student);
    }
}
