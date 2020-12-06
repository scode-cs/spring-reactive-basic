package com.scode.reactive.sample;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

class BasicReactiveTest {

    @Test
    void fluxTest() {
        Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive")
                .concatWith(Flux.just("Spring Cloud", "Spring Config"))
//                .concatWith(Flux.error(new RuntimeException("Sample Flux Exc")))
                .map(s -> s.concat(" Flux"))
                .log();

        stringFlux.buffer(3).subscribe(resp -> System.out.println(resp),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed!!"));
    }
}
