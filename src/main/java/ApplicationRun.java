
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="namee")
@EnableAutoConfiguration
@SpringBootApplication
public class ApplicationRun {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRun.class, args);
	}
}
