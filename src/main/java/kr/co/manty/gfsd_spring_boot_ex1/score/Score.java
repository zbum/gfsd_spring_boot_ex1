package kr.co.manty.gfsd_spring_boot_ex1.score;


import jakarta.persistence.*;
import kr.co.manty.gfsd_spring_boot_ex1.student.Student;

import java.util.Objects;

@Entity
public class Score {
    @Id
    private Long id;

    private Integer semester;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "student_id")
    private Student student;

    private Integer score;

    public Score() {
    }

    public Score(Long id, Integer semester, Student student, Integer score) {
        this.id = id;
        this.semester = semester;
        this.student = student;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score1 = (Score) o;
        return Objects.equals(id, score1.id) && Objects.equals(semester, score1.semester) && Objects.equals(student, score1.student) && Objects.equals(score, score1.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, semester, student, score);
    }
}
