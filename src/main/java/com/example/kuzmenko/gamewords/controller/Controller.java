package com.example.kuzmenko.gamewords.controller;

import com.example.kuzmenko.gamewords.service.Service;
import com.example.kuzmenko.gamewords.domain.Words;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("words")
public class Controller {

  private final Service service = new Service();

  @PostMapping
  public Words newWords(@RequestBody Words json){
    return service.result(json);
  }

}
