package kr.co.manty.gfsd_spring_boot_ex1.score;

import kr.co.manty.gfsd_spring_boot_ex1.student.Student;
import org.springframework.lang.NonNull;

public class ScoreRegistrationRequest {
    private Long id;
    private Integer semester;

    private Integer score;

    private Long studentNumber;

    public ScoreRegistrationRequest() {
    }

    public ScoreRegistrationRequest(Long id, Integer semester, Integer score, Long studentNumber, String studentName) {
        this.id = id;
        this.semester = semester;
        this.score = score;
        this.studentNumber = studentNumber;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }


    public static ScoreRegistrationRequest from (@NonNull Score score) {
        return new ScoreRegistrationRequest(score.getId(), score.getSemester(), score.getScore(), score.getStudent().getId(), score.getStudent().getName());
    }

    public Score toEntity() {
        return new Score(
                this.getId(), this.getSemester(), new Student(this.getStudentNumber(), null),
                this.getScore()
                );
    }
}
