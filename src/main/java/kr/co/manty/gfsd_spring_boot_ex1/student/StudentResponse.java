package kr.co.manty.gfsd_spring_boot_ex1.student;

import org.springframework.lang.NonNull;

public class StudentResponse {
    private Long id;
    private String name;

    public StudentResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static StudentResponse from(@NonNull Student student) {
        return new StudentResponse(student.getId(), student.getName());
    }
}
