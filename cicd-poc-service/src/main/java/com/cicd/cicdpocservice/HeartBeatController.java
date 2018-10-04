package com.cicd.cicdpocservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController
{
	@GetMapping("/heartbeat")
	public String sayHi()
	{
		return "cicd-poc-service is Alive";
	}

}
