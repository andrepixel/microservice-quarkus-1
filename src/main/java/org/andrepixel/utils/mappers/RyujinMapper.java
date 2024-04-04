package org.andrepixel.utils.mappers;

import org.andrepixel.dtos.RyujinDto;
import org.andrepixel.models.RyujinModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RyujinMapper {
  RyujinMapper INSTANCE = Mappers.getMapper(RyujinMapper.class);

  RyujinDto toTicketDto(RyujinModel model);

  RyujinModel toTicketModel(RyujinDto dto);
}
