package com.misiontic.masterclass3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.masterclass3.entities.Client;
import com.misiontic.masterclass3.services.ClientService;


@RestController
@RequestMapping("/api/Client")
public class ClientController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client p){
        return clientService.save(p);
    }
}
