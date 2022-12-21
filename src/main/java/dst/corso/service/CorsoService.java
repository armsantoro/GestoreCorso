package dst.corso.service;

import dst.corso.api.CorsoApiDelegate;
import dst.corso.mapper.CorsoMapper;
import dst.corso.model.*;
import dst.corso.repository.CorsoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CorsoService implements CorsoApiDelegate {

    private final CorsoRepository repo;
    private final CorsoMapper map;
    private final StudenteService sServ;

    @Override
    public ResponseEntity<List<CorsoOutputDTO>> findAll() {
        return ResponseEntity.ok(map.corsoInputDtoToCorsoDTO(repo.findAll()));
    }

    @Override
    public ResponseEntity<CorsoOutputDTO> findById(Long id) {
        Optional<Corso> opt = repo.findById(id);
        if (opt.isPresent()) {
            CorsoOutputDTO cDto = map.corsoToCorsoDTO(opt.get());
            return ResponseEntity.ok(cDto);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<CorsoOutputDTO> addCorso(CorsoInputDTO corsoInputDTO) {
        return CorsoApiDelegate.super.addCorso(corsoInputDTO);
    }

    @Override
    public ResponseEntity<StudenteOutputDTO> addStudToCorso(Long id, StudenteInputDTO studenteInputDTO) {
        if (studenteInputDTO.getCorso() == id) {
            if (sServ.addStudente(studenteInputDTO))
                return ResponseEntity.ok().build();
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<StudenteOutputDTO> removeStudToCorso(Long id, StudenteInputDTO studenteInputDTO) {
        return CorsoApiDelegate.super.removeStudToCorso(id, studenteInputDTO);
    }
}

