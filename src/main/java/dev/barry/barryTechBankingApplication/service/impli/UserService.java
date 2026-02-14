package dev.barry.barryTechBankingApplication.service.impli;

import dev.barry.barryTechBankingApplication.dto.*;

public interface UserService {
   BankResponse createAccount(UserRequest userRequest);
   BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
   String nameEnquiry(EnquiryRequest request);
   BankResponse creditAccount(CreditDebitRequest request);
   BankResponse debitAccount(CreditDebitRequest request);
   BankResponse transfer(TransferRequest request);
   BankResponse login(LoginDto loginDto);

}
