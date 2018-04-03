package repository;

import data.Mieszkanie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MieszkanieRepository extends JpaRepository<Mieszkanie, Long> {
}
