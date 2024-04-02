package ru.zubkoff.sber.hw21.back;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentDateTimeController {
  @GetMapping("/datetime/current")
  public Instant getMethodName() {
    return Instant.now();
  }

}
