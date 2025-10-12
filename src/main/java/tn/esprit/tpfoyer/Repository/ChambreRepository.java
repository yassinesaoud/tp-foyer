package tn.esprit.tpfoyer.Repository;

import tn.esprit.tpfoyer.Model.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
