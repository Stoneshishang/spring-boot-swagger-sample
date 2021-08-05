package com.example.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket swaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails(){   //This is a swagger contact information class
        return new ApiInfo(
                "Address book API",
                "Sample API for JavaBrains tutorial",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Shang Shi", "http://javabrains.io", "stoneshishang@gmail.com"),
                "API License",
                "http://javabrains.io",
                Collections.emptyList()
        );
    }

}
