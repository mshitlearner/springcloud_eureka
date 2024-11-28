package in.mshitlearner.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.mshitlearner.config.OpenFeignRetryerConfig;

@FeignClient(name = "PAYMENT-PROVIDER", configuration = OpenFeignRetryerConfig.class)
public interface PaymentClient {

	@GetMapping("payment/payNow/{price}")
	public String payNow(@PathVariable int price);
}
