package com.scode.reactive.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

//@EnableWebFlux
@Configuration
public class SwaggerConfig {

//    @Bean
//    public Docket api(final TypeResolver typeResolver) {
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any()).build();
//    }

    @Bean
    public OpenAPI openAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
        return new OpenAPI()
                .info(new Info()
                        .title("Sample application API")
                        .version(appVersion)
                        .description(appDesciption)
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
