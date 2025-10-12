package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Model.Bloc;
import tn.esprit.tpfoyer.Repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImp {
    BlocRepository blocRepository;
    
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
