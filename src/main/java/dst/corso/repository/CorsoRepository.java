package dst.corso.repository;

import dst.corso.model.Corso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorsoRepository extends JpaRepository<Corso, Long> {
}
