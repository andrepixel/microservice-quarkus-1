package org.andrepixel.usecases;

import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import org.andrepixel.dtos.WrapperDto;
import org.andrepixel.interfaces.ParseTicketDtoInterface;
import org.andrepixel.models.ConstellationModel;
import org.andrepixel.models.CrimsonFleetModel;
import org.andrepixel.models.FreestarModel;
import org.andrepixel.models.RyujinModel;
import org.andrepixel.models.TicketModel;
import org.andrepixel.utils.mappers.ConstelationMapper;
import org.andrepixel.utils.mappers.CrimsonFleetMapper;
import org.andrepixel.utils.mappers.FreestarMapper;
import org.andrepixel.utils.mappers.RyujinMapper;

@ApplicationScoped
public class ParseTicketToDtoUseCase implements ParseTicketDtoInterface {

  @Override
  public <T extends TicketModel> Object parseTicketToDto(T ticket) {
    Object dto = selectDtoCorrect(ticket);

    return addWrapperDto(dto);
  }

  private <T extends TicketModel> Object selectDtoCorrect(T ticket) {
    return switch (ticket.getClass().getSimpleName()) {
      case "ConstellationModel" -> ConstelationMapper.INSTANCE.toTicketDto(
        (ConstellationModel) ticket
      );
      case "CrimsonFleetModel" -> CrimsonFleetMapper.INSTANCE.toTicketDto(
        (CrimsonFleetModel) ticket
      );
      case "FreestarModel" -> FreestarMapper.INSTANCE.toTicketDto(
        (FreestarModel) ticket
      );
      case "RyujinModel" -> RyujinMapper.INSTANCE.toTicketDto(
        (RyujinModel) ticket
      );
      default -> null;
    };
  }

  private Object addWrapperDto(Object dto) {
    return new WrapperDto(dto, LocalDateTime.now());
  }
}
