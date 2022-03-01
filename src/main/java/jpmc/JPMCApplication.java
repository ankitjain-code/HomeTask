package jpmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PropConfiguration.class)
public class JPMCApplication {

	public static void main(String[] args) {
		SpringApplication.run(JPMCApplication.class, args);
	}

}
