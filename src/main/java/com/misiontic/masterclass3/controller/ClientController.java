package com.misiontic.masterclass3.controller;

import com.misiontic.masterclass3.entities.Client;
import com.misiontic.masterclass3.services.ClientService;
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
@RequestMapping("/api/Client")
public class ClientController {

  @Autowired
  private ClientService clientService;

  @GetMapping("/all")
  public List<Client> getAll() {
    return clientService.getAll();
  }

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Client save(@RequestBody Client a) {
    return clientService.save(a);
  }
}
