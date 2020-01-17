package root.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Reviewer;

@Repository
public interface ReviewerRepository extends JpaRepository<Reviewer, Long> {

}