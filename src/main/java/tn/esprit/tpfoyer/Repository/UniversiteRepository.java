package tn.esprit.tpfoyer.Repository;

import tn.esprit.tpfoyer.Model.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
