package dev.barry.barryTechBankingApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Dev_Barry Academy banking application",
                description = "Backend Rest APIs for Dev_Barry Bank App",
                version = "v1.0",
                contact = @Contact(
                        name = "Ebrima Alsan Barry",
                        email = "barristeryanzeh054@gmail.com",
                        url = "https://github.com/Barry054"
                ),
                license = @License(
                        name = "Dev_Barry Academy",
                        url = "https://github.com/Barry054"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Dev_Barry Academy Bank App Documentation",
                url = "https://github.com/Barry054"
        )
)
public class BarryTechBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarryTechBankingApplication.class, args);
	}

}
