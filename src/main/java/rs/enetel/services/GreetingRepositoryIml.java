package rs.enetel.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryIml implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de Sludo Primario";
	}

	@Override
	public String getGermanGreeting() {
		return "Primärer Begrüßungsdienst";
	}

}
