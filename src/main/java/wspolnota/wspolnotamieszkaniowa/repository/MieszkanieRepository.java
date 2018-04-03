package wspolnota.wspolnotamieszkaniowa.repository;

import wspolnota.wspolnotamieszkaniowa.data.Mieszkanie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MieszkanieRepository extends JpaRepository<Mieszkanie, Long> {
}
