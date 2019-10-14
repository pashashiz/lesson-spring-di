package com.ps.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;

import static com.ps.reactor.Predef.println;

public class Errors {

  @Test
  public void flux_error() throws InterruptedException {
    Flux.just(1, 2, 3)
        .map(i -> {
          if (i > 2)
            throw new RuntimeException("Oops!");
          else
            return i;
        })
        .subscribe(
            Predef::println,
            e -> println("Got error " + e.getMessage()),
            () -> println("Done"));
    Thread.sleep(1000);
  }

  @Test
  public void flux_skipError() throws InterruptedException {
    Flux.just(1, 2, 3)
        .map(i -> {
          if (i > 2)
            throw new RuntimeException("Oops!");
          else
            return i;
        })
        .onErrorContinue((throwable, o) -> println("Ignore " + o))
        .subscribe(System.out::println);
    Thread.sleep(1000);
  }

  @Test
  public void flux_recoverFromError() throws InterruptedException {
    Flux.just(1, 2, 3)
        .map(i -> {
          if (i > 2)
            throw new RuntimeException("Oops!");
          else
            return i;
        })
        .onErrorResume(e -> Flux.just(3, 4, 5))
        .subscribe(Predef::println);
    Thread.sleep(1000);
  }
}
