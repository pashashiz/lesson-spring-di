package com.ps.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Intro {

  @Test
  public void mono_create() throws InterruptedException {
    Mono.just(1)
        .subscribe(System.out::println);
    Thread.sleep(1000);
  }

  @Test
  public void mono_map() throws InterruptedException {
    Mono.just(1)
        .map(value -> value + 1)
        .subscribe(System.out::println);
    Thread.sleep(1000);
  }

  @Test
  public void flux_create() throws InterruptedException {
    Flux.just(1, 2, 3)
        .subscribe(System.out::println);
    Thread.sleep(1000);
  }
}
