package org.andrepixel.utils.mappers;

import org.andrepixel.dtos.CrimsonFleetDto;
import org.andrepixel.models.CrimsonFleetModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CrimsonFleetMapper {
  CrimsonFleetMapper INSTANCE = Mappers.getMapper(CrimsonFleetMapper.class);

  CrimsonFleetDto toTicketDto(CrimsonFleetModel model);

  CrimsonFleetModel toTicketModel(CrimsonFleetDto dto);
}
