package org.andrepixel.utils.mappers;

import org.andrepixel.dtos.TicketDto;
import org.andrepixel.models.TicketModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TicketMapper {
  TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

  TicketDto toTicketDto(TicketModel model);

  TicketModel toTicketModel(TicketDto dto);
}
