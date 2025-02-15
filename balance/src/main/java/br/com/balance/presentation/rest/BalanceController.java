package br.com.balance.presentation.rest;

import br.com.balance.business.usecase.GetBalanceUseCase;
import br.com.balance.presentation.rest.dto.BalanceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balances")
@RequiredArgsConstructor
public class BalanceController {

    private final GetBalanceUseCase getBalanceUseCase;

    @GetMapping("/{accountId}")
    public BalanceDTO getBalance(@PathVariable String accountId) {
        var balance = this.getBalanceUseCase.getBalance(accountId);

        return BalanceDTO.builder()
                .accountId(balance.getAccountId())
                .amount(balance.getAmount())
                .build();
    }
}
