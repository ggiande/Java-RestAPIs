package com.example.restapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*Initialize/handle all the swagger related config */
    //name of our package
    // that gets scanned to build the swagger ui
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Swagger API Implementation By ggiande",
                "API Reference Example By ggiande",
                "1.0.0",
                "Private API",
                new Contact("ggiande",
                        "https://www.linkedin.com/in/giancarlo-garcia/",
                        "ggarciadeleon@csustan.edu"),
                "API License Open",
                "https://github.com/ggiande",
                Collections.emptyList());
    }
}
