package kr.co.manty.gfsd_spring_boot_ex1.student;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student Not Found : " + id);
    }
}
