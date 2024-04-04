package org.andrepixel.utils.mappers;

import org.andrepixel.dtos.ConstellationDto;
import org.andrepixel.models.ConstellationModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConstelationMapper {
  ConstelationMapper INSTANCE = Mappers.getMapper(ConstelationMapper.class);

  ConstellationDto toTicketDto(ConstellationModel model);

  ConstellationModel toTicketModel(ConstellationDto dto);
}
