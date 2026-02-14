package dev.barry.barryTechBankingApplication.repository;

import dev.barry.barryTechBankingApplication.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
