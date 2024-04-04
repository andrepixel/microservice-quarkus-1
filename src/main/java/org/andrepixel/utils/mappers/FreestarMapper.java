package org.andrepixel.utils.mappers;

import org.andrepixel.dtos.FreestarDto;
import org.andrepixel.models.FreestarModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FreestarMapper {
  FreestarMapper INSTANCE = Mappers.getMapper(FreestarMapper.class);

  FreestarDto toTicketDto(FreestarModel model);

  FreestarModel toTicketModel(FreestarDto dto);
}
