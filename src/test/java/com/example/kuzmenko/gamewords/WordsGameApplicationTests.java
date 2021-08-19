package com.example.kuzmenko.gamewords;

import com.example.kuzmenko.gamewords.domain.Words;
import com.example.kuzmenko.gamewords.service.Service;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsGameApplicationTests {

  private final Service service = new Service();

  @Test
  public void testResult1() {
    List<String> example = new ArrayList<>(Arrays.asList("fish", "horse", "egg", "goose", "eagle"));
    List<String> conclusion = new ArrayList<>(Arrays.asList("fish", "horse", "egg", "goose", "eagle"));
    Words words = new Words();
    Words result = new Words();
    words.getWords().addAll(example);
    result.getWords().addAll(conclusion);
    assertEquals(result.getWords(), service.result(words).getWords());
  }

  @Test
  public void testResult2() {
    List<String> example = new ArrayList<>(Arrays.asList("fish", "horse", "snake", "goose", "eagle"));
    List<String> conclusion = new ArrayList<>(Arrays.asList("fish", "horse"));
    Words words = new Words();
    Words result = new Words();
    words.getWords().addAll(example);
    result.getWords().addAll(conclusion);
    assertEquals(result.getWords(), service.result(words).getWords());
  }

  @Test
  public void testResult3() {
    List<String> example = new ArrayList<>(Arrays.asList("fish", "horse", "", "goose", "eagle"));
    List<String> conclusion = new ArrayList<>(Arrays.asList("fish", "horse"));
    Words words = new Words();
    Words result = new Words();
    words.getWords().addAll(example);
    result.getWords().addAll(conclusion);
    assertEquals(result.getWords(), service.result(words).getWords());
  }

  @Test
  public void testResult4() {
    List<String> example = new ArrayList<>(Arrays.asList("", "horse", "", "goose", "eagle"));
    List<String> conclusion = new ArrayList<>(Arrays.asList());
    Words words = new Words();
    Words result = new Words();
    words.getWords().addAll(example);
    result.getWords().addAll(conclusion);
    assertEquals(result.getWords(), service.result(words).getWords());
  }

}
