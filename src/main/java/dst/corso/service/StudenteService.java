package dst.corso.service;

import dst.corso.mapper.StudenteMapper;
import dst.corso.model.Studente;
import dst.corso.model.StudenteInputDTO;
import dst.corso.repository.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudenteService {

    @Autowired
    private StudenteRepository studenteRepository;
    @Autowired
    private StudenteMapper sMapper;
    public boolean addStudente (StudenteInputDTO sDto){
        Studente s = sMapper.studenteToStudenteImputDTO(sDto);
        Optional<Studente> optS = studenteRepository.findById(s.getId());
        if(optS.isPresent())
            return false;
        studenteRepository.save(s);
        return true;
    }
}
