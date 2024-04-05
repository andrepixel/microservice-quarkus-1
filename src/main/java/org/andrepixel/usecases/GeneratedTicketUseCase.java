package org.andrepixel.usecases;

import java.util.Random;
import org.andrepixel.interfaces.GeneratedTicketInterface;
import org.andrepixel.models.ConstellationModel;
import org.andrepixel.models.CrimsonFleetModel;
import org.andrepixel.models.FreestarModel;
import org.andrepixel.models.RyujinModel;
import org.andrepixel.models.TicketModel;
import org.instancio.Instancio;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GeneratedTicketUseCase implements GeneratedTicketInterface {

  public TicketModel generateTicket() {
    TicketModel generatedTicket = randomModelTicketModel();

    return generatedTicket;
  }

  private TicketModel randomModelTicketModel() {
    int generatedOption = new Random().nextInt(0, 4);

    return switch (generatedOption) {
      case 0 -> generateInstanceTicket(ConstellationModel.class);
      case 1 -> generateInstanceTicket(CrimsonFleetModel.class);
      case 2 -> generateInstanceTicket(FreestarModel.class);
      case 3 -> generateInstanceTicket(RyujinModel.class);
      default -> null;
    };
  }

  private TicketModel generateInstanceTicket(
    Class<? extends TicketModel> instance
  ) {
    TicketModel generatedTicket = Instancio.of(instance).create();

    return generatedTicket;
  }
}
