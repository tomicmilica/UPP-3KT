package root.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ScientificArea;

public interface ScientificAreaRepository  extends JpaRepository<ScientificArea, Long> {
	ScientificArea findOneByName(String name);
}
