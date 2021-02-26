package com.assist.java.multitenancy.controller;

import com.assist.java.multitenancy.domain.Choir;
import com.assist.java.multitenancy.service.ChoirService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/choirs")
public class ChoirController {

  private final ChoirService choirService;

  public ChoirController(final ChoirService choirService) {
    this.choirService = choirService;
  }

  @PostMapping
  public void save(@RequestBody Choir choir) {
    choirService.saveChoir(choir);
  }

  @GetMapping
  public List<Choir> getAll() {
    return choirService.getAllChoirs();
  }
}
