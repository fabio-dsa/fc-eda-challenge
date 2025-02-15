package br.com.balance.business.usecase;

import br.com.balance.business.entity.Balance;
import br.com.balance.business.exception.ResourceNotFoundException;
import br.com.balance.integration.repository.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetBalanceUseCase {

    private final BalanceRepository balanceRepository;

    public Balance getBalance(String accountId) {
        return this.balanceRepository.findFirstByAccountIdOrderByCreatedAtDesc(accountId)
                .orElseThrow(() -> new ResourceNotFoundException("No balance found for account id: " + accountId));
    }
}
