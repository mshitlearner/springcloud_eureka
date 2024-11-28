package in.mshitlearner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient - In Old version spring boot 2x version we need to write enable the eureka client manually
public class PaymentServiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
