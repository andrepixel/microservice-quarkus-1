package org.andrepixel.usecases;

import jakarta.enterprise.context.ApplicationScoped;
import org.andrepixel.dtos.TicketDtoInterface;
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
  public <T extends TicketModel> TicketDtoInterface parseTicketToDto(T ticket) {
    return selectDtoCorrect(ticket);
  }

  private <T extends TicketModel> TicketDtoInterface selectDtoCorrect(T ticket) {
    return switch (ticket.getClass().getSimpleName()) {
      case "ConstellationModel" -> ConstelationMapper.INSTANCE.toTicketDto(
          (ConstellationModel) ticket);
      case "CrimsonFleetModel" -> CrimsonFleetMapper.INSTANCE.toTicketDto(
          (CrimsonFleetModel) ticket);
      case "FreestarModel" -> FreestarMapper.INSTANCE.toTicketDto(
          (FreestarModel) ticket);
      case "RyujinModel" -> RyujinMapper.INSTANCE.toTicketDto(
          (RyujinModel) ticket);
      default -> null;
    };
  }
}
