package dst.corso.mapper;

import dst.corso.model.Corso;
import dst.corso.model.CorsoInputDTO;
import dst.corso.model.CorsoOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CorsoMapper.class})
public interface CorsoMapper {
    CorsoMapper INSTANCE = Mappers.getMapper(CorsoMapper.class);
    CorsoOutputDTO corsoToCorsoDTO(Corso c);
    List<CorsoOutputDTO> corsoInputDtoToCorsoDTO(CorsoInputDTO cDto);

}
