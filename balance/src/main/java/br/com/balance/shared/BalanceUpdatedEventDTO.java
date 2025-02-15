package br.com.balance.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BalanceUpdatedEventDTO {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Payload")
    private BalanceUpdatedPayloadDTO payload;
}