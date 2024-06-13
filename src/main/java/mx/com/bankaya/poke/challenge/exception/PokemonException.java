package mx.com.bankaya.poke.challenge.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT)
public class PokemonException extends RuntimeException {

	private static final long serialVersionUID = 3376611800343914152L;

	public PokemonException(String message) {
		super(message);
	}
	
}
