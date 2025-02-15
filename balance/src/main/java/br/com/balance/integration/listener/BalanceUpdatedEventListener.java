package br.com.balance.integration.listener;

import br.com.balance.business.usecase.UpdateBalanceUseCase;
import br.com.balance.shared.BalanceUpdatedEventDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class BalanceUpdatedEventListener {

    private final UpdateBalanceUseCase updateBalanceUseCase;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "balances")
    public void onBalanceUpdated(String message) throws JsonProcessingException {
        log.info("Received message: {}", message);
        var event = objectMapper.readValue(message, BalanceUpdatedEventDTO.class);
        updateBalanceUseCase.execute(event);
    }
}
