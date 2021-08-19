package com.example.kuzmenko.gamewords.controller;

import com.example.kuzmenko.gamewords.domain.Words;
import com.example.kuzmenko.gamewords.service.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("words")
public class Controller {

  private final Service service = new Service();

  @PostMapping
  public Words newWords(@RequestBody Words json) {
    return service.result(json);
  }

}
