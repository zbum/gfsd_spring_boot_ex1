package kr.co.manty.gfsd_spring_boot_ex1.score;

import kr.co.manty.gfsd_spring_boot_ex1.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class ScoreRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    ScoreRepository scoreRepository;

    @Test
    void testBasicScoreRepository() {
        Score scoreOfManty = new Score(1L, 2024, new Student(1L, "Manty"), 100);
        Score merged = entityManager.merge(scoreOfManty);

        Optional<Score> findById = scoreRepository.findById(1L);

        assertThat(findById).isPresent();
    }

    @Test
    void testFindByStudentId() {
        Score scoreOfManty = new Score(1L, 2024, new Student(1L, "Manty"), 100);
        Score merged = entityManager.merge(scoreOfManty);

        List<Score> actual = scoreRepository.findByStudentId(1L);

        assertThat(actual).hasSize(1);
    }

}