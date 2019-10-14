package com.ps.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;

import static com.ps.reactor.Predef.println;

public class Combine {

  @Test
  public void example() {
    println(findCustomer(1).flatMap(this::isReliable).block());
    println(findCustomer(2).flatMap(this::isReliable).block());
  }

  public Mono<String> findCustomer(int id) {
    return Mono.just(id == 1 ? "Pavlo" : "Yura");
  }

  public Mono<Boolean> isReliable(String name) {
    return Mono.just("Pavlo".equals(name));
  }
}
