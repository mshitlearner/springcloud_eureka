package in.mshitlearner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mshitlearner.client.PaymentClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	
	@Autowired
	private PaymentClient paymentClient;
	
	@GetMapping("/payment/{price}")
	public String invokePaymentService(@PathVariable int price) {
		return paymentClient.payNow(price);
	}
}
