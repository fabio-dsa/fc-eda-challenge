package br.com.balance.business.usecase;

import br.com.balance.business.entity.Balance;
import br.com.balance.integration.repository.BalanceRepository;
import br.com.balance.shared.BalanceUpdatedEventDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdateBalanceUseCase {

    private final BalanceRepository balanceRepository;

    public UpdateBalanceUseCase(BalanceRepository balanceRepository) {
        this.balanceRepository = balanceRepository;
    }

    @Transactional
    public void execute(BalanceUpdatedEventDTO balanceUpdatedEventDTO) {
        var balanceFrom = Balance.builder()
                .accountId(balanceUpdatedEventDTO.getPayload().getAccountIdFrom())
                .amount(balanceUpdatedEventDTO.getPayload().getBalanceAccountFrom())
                .build();

        var balanceTo = Balance.builder()
                .accountId(balanceUpdatedEventDTO.getPayload().getAccountIdTo())
                .amount(balanceUpdatedEventDTO.getPayload().getBalanceAccountTo())
                .build();

        this.balanceRepository.saveAll(List.of(balanceFrom, balanceTo));
    }
}
