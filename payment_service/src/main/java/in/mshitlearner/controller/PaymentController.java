package in.mshitlearner.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Value("${server.port}")
	private String portNumber;

	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "payment with " + price + " is successfull with port no :"+ portNumber;
	}
	
}
