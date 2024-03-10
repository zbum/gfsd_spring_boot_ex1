package kr.co.manty.gfsd_spring_boot_ex1.course;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    public List<Score> getScores() {
        return scoreRepository.findAll();
    }

    public List<Score> getScoresByStudentId(Long studentId) {
        return scoreRepository.findByStudentId(studentId);
    }

    @Transactional
    public Score addScoresByStudentId(Score score) {
        return scoreRepository.save(score);
    }
}
