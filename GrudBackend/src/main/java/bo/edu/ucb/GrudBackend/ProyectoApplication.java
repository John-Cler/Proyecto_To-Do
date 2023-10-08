package bo.edu.ucb.GrudBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@PostConstruct
	void started() {
		// Configura la zona horaria de tu elección
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
