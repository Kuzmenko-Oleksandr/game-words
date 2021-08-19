package com.example.kuzmenko.gamewords.domain;

import java.util.ArrayList;
import java.util.List;

public class Words {

  private List<String> words = new ArrayList<>();

  public Words() {
  }

  public List<String> getWords() {
    return words;
  }

  public void setWords(List<String> words) {
    this.words = words;
  }
}
