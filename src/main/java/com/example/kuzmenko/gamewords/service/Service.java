package com.example.kuzmenko.gamewords.service;

import com.example.kuzmenko.gamewords.domain.Words;

public class Service {

  public Words result(Words json) {
    Words words = new Words();
    char first, last;

    if (!json.getWords().get(0).isBlank()) {
      words.getWords().add(json.getWords().get(0));
      for (int i = 1; i <= json.getWords().size() - 1; i++) {
        if (json.getWords().get(i).isBlank()) {
          break;
        }

        first = json.getWords().get(i).charAt(0);
        last = json.getWords().get(i - 1).charAt(json.getWords().get(i - 1).length() - 1);

        if (last == first) {
          words.getWords().add(json.getWords().get(i));
        } else {
          break;
        }
      }
    }
    return words;
  }
}
