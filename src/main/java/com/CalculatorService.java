package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum")
	public int sum() {
		return 20+10;
	}
	@GetMapping("/substract")
	public int substract() {
		return (20-10);
	}
	@GetMapping("/multiply")
	public int multiply() {
		return 20*10;
	}
	@GetMapping("/divide")
	public float divide() {
		return 20/10;
	}
	@GetMapping("/mod")
	public int mod() {
		return 20%10;
	}

}
