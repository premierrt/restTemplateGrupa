package client_restTemplate;

import java.net.URI;
import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import client_restTemplate.io.swagger.client.model.GetGroupResponse;
import client_restTemplate.io.swagger.client.model.ResponseEntity;

@SpringBootApplication
public class ClientRestTemplateGroupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRestTemplateGroupApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			System.out.println("start client ********************");
			String url = "http://localhost:7024/group-service/groups/prepaid/48796809221/members";
			HttpHeaders httpHeades = new HttpHeaders();
			httpHeades.set("System-User-Name", "eshop");
			httpHeades.set("System-Name", "eshop");
			httpHeades.set("Channel-Name", "eshop");
			httpHeades.set("Owner", "P4");
			httpHeades.set("Usage-Mode", "NORMAL");
			httpHeades.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

			/// https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/http-entity.html
			HttpEntity<String> entity = new HttpEntity<String>("paremeters", httpHeades);
			org.springframework.http.ResponseEntity<GetGroupResponse> respone = null;

			// When server returns an "unsuccessful" status code,
			// DefaultResponseErrorHandler will throw a instance of
			// HttpStatusCodeException, which has a method
			// "getResponseBodyAsString()".
			try {
				respone = restTemplate.exchange(url, HttpMethod.GET, entity, GetGroupResponse.class);
				System.out.println(respone.getBody().getMembers().toString());
			} catch (HttpStatusCodeException ex) {
				System.out.println(ex.getResponseBodyAsString());
			}
			//System.out.println(respone.getBody().getMembers().toString());

			// dodac serializacje jeśli nie ma wyjatku
			//http://www.baeldung.com/jackson-object-mapper-tutorial
			
			
			

		};
	}
}
