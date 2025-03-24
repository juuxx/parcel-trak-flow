package org.example.parcel.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParcelController {

	@GetMapping("/hello")
	public String hello(){
		return "Hello Parcel Project";
	}
}
