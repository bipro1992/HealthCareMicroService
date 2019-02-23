package hcportal.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author biprajeet
 * 
 * 
 *         Eureka Server
 * 
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class HcPortalDiscoveryServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(HcPortalDiscoveryServer.class, args);
		
		
	}

}
