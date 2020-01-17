package root.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Editor;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Long> {

}
