package br.com.balance.integration.repository;

import br.com.balance.business.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

    Optional<Balance> findFirstByAccountIdOrderByCreatedAtDesc(String accountId);
}
