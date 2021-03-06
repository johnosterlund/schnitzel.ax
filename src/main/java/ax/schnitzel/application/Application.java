package ax.schnitzel.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The application's entry point.
 * 
 * @see {@link org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter}
 */
@ComponentScan(basePackages = { "ax.schnitzel" })
@EnableAutoConfiguration
@EnableScheduling
public class Application extends WebMvcConfigurerAdapter {

	/**
	 * @param args command-line arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
