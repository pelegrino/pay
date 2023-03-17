package br.com.pelegrino.pay;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayService {

	@PostMapping(path = "/pay", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentResponse> pagar(
			@RequestHeader("Token") String token,
			@Valid @RequestBody DadosCartao dadosCartao,
			Errors erros) {
		
		
	}
}
