package com.misiontic.masterclass3.controller;

import com.misiontic.masterclass3.entities.Motorbike;
import com.misiontic.masterclass3.services.MotorbikeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Motorbike")
public class MotorbikeController {

  @Autowired
  private MotorbikeService motorbikeService;

  @GetMapping("/all")
  public List<Motorbike> getAll() {
    return motorbikeService.getAll();
  }

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Motorbike save(@RequestBody Motorbike n) {
    return motorbikeService.save(n);
  }
}
