package com.bage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/all")
	public String all() {
		List<String> list = discoveryClient.getServices();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			stringBuilder.append(list.get(i) + ",");
		}
		System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
	}

}
