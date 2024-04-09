package org.andrepixel.usecases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ParseTicketToJsonUseCase {

  public byte[] parseDtoToJson(Object dto) throws JsonProcessingException {
    ObjectMapper mapper = JsonMapper
      .builder()
      .addModule(new JavaTimeModule())
      .build();

    return mapper.writeValueAsBytes(dto);
  }
}
