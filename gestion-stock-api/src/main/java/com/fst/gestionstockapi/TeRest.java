package com.fst.gestionstockapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeRest {
	@GetMapping("/")
	public int index() {
		return 1;
	}
}
