package dev.barry.barryTechBankingApplication.service.impli;

import dev.barry.barryTechBankingApplication.dto.TransactionDto;
import dev.barry.barryTechBankingApplication.entity.Transaction;

public interface TransactionService{
    void saveTransaction(TransactionDto transactionDto);
}
