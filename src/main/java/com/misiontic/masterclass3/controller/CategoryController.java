package com.misiontic.masterclass3.controller;

import com.misiontic.masterclass3.entities.Category;
import com.misiontic.masterclass3.services.CategoryService;
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
@RequestMapping("/api/Category")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  @GetMapping("/all")
  public List<Category> getAll() {
    return categoryService.getAll();
  }

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Category save(@RequestBody Category c) {
    return categoryService.save(c);
  }
}
