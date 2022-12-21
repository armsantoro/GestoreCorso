package dst.corso.mapper;

import dst.corso.model.Studente;
import dst.corso.model.StudenteInputDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CorsoMapper.class})
public interface StudenteMapper {
    Studente studenteToStudenteImputDTO(StudenteInputDTO sDto);
}
