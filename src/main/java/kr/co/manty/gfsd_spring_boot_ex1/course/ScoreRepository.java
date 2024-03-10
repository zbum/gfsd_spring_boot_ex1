package kr.co.manty.gfsd_spring_boot_ex1.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    List<Score> findByStudentId(Long id);
}
