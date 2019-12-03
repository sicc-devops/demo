package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private Environment env;
	
	@RequestMapping("/demo")
	public String init() throws UnknownHostException {
		String host = InetAddress.getLocalHost().getHostName();
		String host_ip = InetAddress.getLocalHost().getHostAddress();
		return "Demo App (ver.1.0) Running on the host => "+ host + "[" + host_ip + "]";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
