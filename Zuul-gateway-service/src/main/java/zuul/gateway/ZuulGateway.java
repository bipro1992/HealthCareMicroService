package zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author Biprajeet
 * 
 *         This is zuul gateway class, to provide proxy for our rest services.
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulGateway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(ZuulGateway.class, args);

	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

}
