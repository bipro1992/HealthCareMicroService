package hcportal.employer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author biprajeet
 * 
 * 
 *         This is Employer rest class
 * 
 * 
 *
 */
@EnableJpaRepositories(basePackages = "hcportal.employer.repository")
@SpringBootApplication
@EnableDiscoveryClient
public class EmployerRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(EmployerRest.class, args);

	}

}
