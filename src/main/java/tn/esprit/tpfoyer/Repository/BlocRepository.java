package tn.esprit.tpfoyer.Repository;

import tn.esprit.tpfoyer.Model.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
