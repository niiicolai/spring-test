package dat3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dat3.demo.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
