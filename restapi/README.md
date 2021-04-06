# What is Swagger

- An open source API Documentation framework to help developers in design, document, and consume RESTful web services
- Swagger reads an API and extract in the form of interactive UI called as "Swagger UI"
- Swagger UI offers HTML view of API with JSON Support
- The most popular too for generating interactive documentation from API

## Postman VS Swagger


<img alt="Postman" src="https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fa2c1d0b4-aff4-470a-8fbf-0a3e2380488b%2FUntitled.png?table=block&id=f6bf4f83-10c7-4b94-9f6b-60dde197e4b6&width=3840&userId=3b0abf0f-e2f2-4a2f-8408-bc9d17977684&cache=v2" width=600>

<img alt="Swagger" src="https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F4f6f60e6-ccd8-4f9b-aa34-fc14682d7318%2FUntitled.png?table=block&id=b8bdfa98-7684-4593-bc5c-3a15f99439ed&width=3840&userId=3b0abf0f-e2f2-4a2f-8408-bc9d17977684&cache=v2" width=600>

---

- Various options need to be selected, and require user interaction to change arguments

- Automatically detects the values from the APIs
- Any change is re-automatically applied in the UI after REST API Restart

## Real Time Swagger Use Case

Can quickly test multiple APIs at once using Swagger

<img alt="Real Time Swagger" src="https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fc120690f-19e1-4c5f-9d69-8c8512505c98%2FUntitled.png?table=block&id=f155e60c-8bf8-4b70-900d-e5cbaa181e3e&width=3840&userId=3b0abf0f-e2f2-4a2f-8408-bc9d17977684&cache=v2" width=600>

## Important Facts about Swagger

- Widely adopted API Documentation Framework
- Drastically reduce the understanding curve for an API

Credit: [Java TechBooster](https://www.youtube.com/watch?v=txArM31my9M&t=26s)

# How to Configure Swagger in REST API Using Spring Boot

<img alt="Swagger in SpringBoot DEMO" src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c3870ab1-521e-4302-9eb0-5846cd60936f/swagger_demo.gif?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210406%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210406T033350Z&X-Amz-Expires=86400&X-Amz-Signature=73e20876387d8f31766868cb4a98c0068b3b3c1b05a4d1e9da1e04c28ae0b951&X-Amz-SignedHeaders=host" width=600>


## Add Swagger Dependency

Maven:

```sql
<!-- Swagger 2 Dependencies -->
		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
		*<depen*dency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.1</version>
		</dependency>
```

## Swagger Configuration

```sql
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
                "API License Open",
                Collections.emptyList());
    }
}
```