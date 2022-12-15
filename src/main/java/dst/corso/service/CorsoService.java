package dst.corso.service;

import dst.corso.api.CorsoApiDelegate;
import dst.corso.model.Corso;
import dst.corso.model.CorsoOutputDTO;
import dst.corso.repository.CorsoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CorsoService implements CorsoApiDelegate {

    private final CorsoRepository repo;
    @Override
    public ResponseEntity<List<CorsoOutputDTO>> findAll() {
        List<CorsoOutputDTO> corsoDTO = new ArrayList<>();
        List<Corso> corsi = repo.findAll();
        for (Corso c: corsi
             ) {
            CorsoOutputDTO cDto = PersonaMapper

        }

    }
}
