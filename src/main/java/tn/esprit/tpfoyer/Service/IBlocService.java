package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Model.Bloc;
import tn.esprit.tpfoyer.Model.TypeChambre;
import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc addBloc(Bloc b);
    Bloc updateBloc(Bloc b);
    Bloc retrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);
    List<Bloc> retrieveBlocsByFoyerCapacite(String capaciteFoyer);
    List<Bloc> retrieveBlocsByChambreType(TypeChambre typeChambre);
    List<Bloc> retrieveBlocsByCapaciteRange(long lessThan, long greaterThan);
}
