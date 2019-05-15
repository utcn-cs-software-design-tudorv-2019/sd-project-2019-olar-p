package finalproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FinalProject {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(FinalProject.class)
		.headless(false)
		.run(args);
	}
}
