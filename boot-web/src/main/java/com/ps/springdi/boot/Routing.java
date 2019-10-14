package com.ps.springdi.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Routing {

    @Bean
    public RouterFunction<ServerResponse> router() {
        return route()
            .GET("/", this::hello)
            .build();
    }

    private Mono<ServerResponse> hello(ServerRequest request) {
        Mono<String> value = Mono
            .just(request.queryParam("name").orElse("unknown"))
            .map(name -> "Hello " + name);
        return ServerResponse.ok().body(value, String.class);
    }
}
