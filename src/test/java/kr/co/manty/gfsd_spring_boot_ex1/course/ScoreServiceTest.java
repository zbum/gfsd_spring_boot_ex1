package kr.co.manty.gfsd_spring_boot_ex1.course;

import kr.co.manty.gfsd_spring_boot_ex1.student.Student;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class ScoreServiceTest {

    @Autowired
    ScoreService scoreService;

    @MockBean
    ScoreRepository scoreRepository;

    @Test
    void testGetScores() {
        given(scoreRepository.findAll())
                .willReturn(List.of(new Score(1L, 1, new Student(1L, "Manty"), 100)));

        List<Score> actual = scoreService.getScores();

        Assertions.assertThat(actual).hasSize(1);
    }
}