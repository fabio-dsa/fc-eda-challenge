package br.com.balance.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BalanceUpdatedPayloadDTO {

    @JsonProperty("account_id_from")
    private String accountIdFrom;

    @JsonProperty("account_id_to")
    private String accountIdTo;

    @JsonProperty("balance_account_id_from")
    private BigDecimal balanceAccountFrom;

    @JsonProperty("balance_account_id_to")
    private BigDecimal balanceAccountTo;
}
