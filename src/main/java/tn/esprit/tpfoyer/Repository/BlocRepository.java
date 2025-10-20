package tn.esprit.tpfoyer.Repository;

import tn.esprit.tpfoyer.Model.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Model.TypeChambre;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findByFoyerCapaciteFoyer(String capaciteFoyer);
    List<Bloc> findByChambresTypeChambre(TypeChambre typeChambre);
    List<Bloc> findByCapaciteBLocLessThanOrCapaciteBLocGreaterThan(long lessThan, long greaterThan);
}
