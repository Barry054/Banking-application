package dev.barry.barryTechBankingApplication.service.impli;

import dev.barry.barryTechBankingApplication.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
