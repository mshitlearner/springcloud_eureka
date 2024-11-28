package in.mshitlearner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Retryer;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class OpenFeignRetryerConfig {
	
	@Bean
    public Retryer feignRetryer() {
        // Retryer.Default(period, maxPeriod, maxAttempts)
        return new Retryer.Default(1000, SECONDS.toMillis(5), 5);  // 1 second between retries, max period 5 seconds, 5 retry attempts
    }
}
