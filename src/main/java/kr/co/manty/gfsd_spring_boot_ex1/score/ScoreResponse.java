package kr.co.manty.gfsd_spring_boot_ex1.score;

import org.springframework.lang.NonNull;

public class ScoreResponse {
    private Long id;
    private Integer semester;

    private Integer score;

    private Long studentNumber;

    private String studentName;

    public ScoreResponse() {
    }

    public ScoreResponse(Long id, Integer semester, Integer score, Long studentNumber, String studentName) {
        this.id = id;
        this.semester = semester;
        this.score = score;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static ScoreResponse from (@NonNull Score score) {
        return new ScoreResponse(score.getId(), score.getSemester(), score.getScore(), score.getStudent().getId(), score.getStudent().getName());
    }
}
