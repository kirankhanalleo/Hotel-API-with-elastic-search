package com.kirankhanal.HotelAPI;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.kirankhanal.HotelAPI.repository")
@EnableElasticsearchRepositories(basePackages = "com.kirankhanal.HotelAPI.elastic.repository")
@EnableScheduling
public class HotelApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApiApplication.class, args);
	}

}
