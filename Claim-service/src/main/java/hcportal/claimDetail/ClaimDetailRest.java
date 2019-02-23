package hcportal.claimDetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;





/**
 * @author biprajeet
 *
 *
 *This is claimdetail rest class providing rest services
 *associated with claims
 *
 *
 */
@EnableJpaRepositories(basePackages="hcportal.claimDetail.repository")
@EnableCaching
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class ClaimDetailRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ClaimDetailRest.class, args);
	}

}
