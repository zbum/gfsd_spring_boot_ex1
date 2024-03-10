package kr.co.manty.gfsd_spring_boot_ex1.course;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("/students/{studentId}/scores")
    public List<ScoreResponse> getScoresByStudentId(
            @PathVariable Long studentId
    ) {
        return scoreService.getScoresByStudentId(studentId)
                .stream()
                .map(ScoreResponse::from)
                .toList();
    }


    @PostMapping("/students/{studentId}/scores")
    public ScoreResponse addScoresByStudentId(
            @PathVariable Long studentId,
            @RequestBody ScoreRegistrationRequest scoreRegistrationRequest
    ) {
        Score score = scoreService.addScoresByStudentId(scoreRegistrationRequest.toEntity());
        return ScoreResponse.from(score);
    }
}
