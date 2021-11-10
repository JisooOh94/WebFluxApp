package com.jisoooh.bulletinboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class BulletinboardApplication {
	public static void main(String[] args) {
		Hooks.onOperatorDebug();
		SpringApplication.run(BulletinboardApplication.class, args);
	}
}