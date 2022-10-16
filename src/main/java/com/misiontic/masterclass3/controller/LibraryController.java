package com.misiontic.masterclass3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.masterclass3.entities.Library;
import com.misiontic.masterclass3.entities.Product;
import com.misiontic.masterclass3.services.LibraryService;
import com.misiontic.masterclass3.services.ProductService;

@RestController
@RequestMapping("/api/Library")
public class LibraryController {
    
    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }

    @PostMapping("/save")
    public Library save(@RequestBody Library p){
        return libraryService.save(p);
    }
}
