package com.ps.reactor;

import org.junit.Test;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Async {

  @Test
  public void generator() {
    Flux.generate(
        () -> 0,
        (state, sink) -> {
          sink.next("number: " + state);
          if (state >= 10)
            sink.complete();
          return state + 1;
        }).subscribe(Predef::println);
  }

  @Test
  public void create() throws InterruptedException {
    Flux<Object> flux = Flux.create(emitter -> {
      Executors.newSingleThreadExecutor().submit(() -> {
        IntStream.range(1, 6)
            .forEach(i -> {
              try {
                Thread.sleep(1000);
                emitter.next("number: " + i);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
        emitter.complete();
      });
    });
    flux.subscribe(Predef::println);
    Thread.sleep(10000);
  }

  @Test
  public void cancel() throws InterruptedException {
    Flux<Object> flux = Flux.create(emitter -> {
      Executors.newSingleThreadExecutor().submit(() -> {
        IntStream.range(1, 11)
            .forEach(i -> {
              try {
                Thread.sleep(1000);
                emitter.next("number: " + i);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
        emitter.complete();
      });
      emitter.onDispose(() -> {
        System.out.println("canceled");
      });
    });
    Disposable first = flux.subscribe(Predef::println);
    Thread.sleep(3000);
    first.dispose();
    Thread.sleep(10000);
  }

}
