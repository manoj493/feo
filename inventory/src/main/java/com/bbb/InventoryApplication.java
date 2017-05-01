package com.bbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class InventoryApplication{

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
	
    @Bean
    public Docket inventoryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
        		.select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/inventory.*"))
                .build();
    }
     
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Inventory Service")
                .description("Documentation for InventoryService")
                .contact("Manoj Mishra")
                .license("Apache License Version 2.0")
                .version("2.0")
                .build();
    }
}
