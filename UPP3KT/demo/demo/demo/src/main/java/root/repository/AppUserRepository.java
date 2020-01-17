package root.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Appuser;

@Repository
public interface AppUserRepository  extends JpaRepository<Appuser, Long> {
	
	 Appuser findOneByEmail(String email);
}
