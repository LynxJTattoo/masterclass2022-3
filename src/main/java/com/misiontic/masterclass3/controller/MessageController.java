package com.misiontic.masterclass3.controller;

import com.misiontic.masterclass3.entities.Message;
import com.misiontic.masterclass3.services.MessageService;
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
@RequestMapping("/api/Message")
public class MessageController {

  @Autowired
  private MessageService messageService;

  @GetMapping("/all")
  public List<Message> getAll() {
    return messageService.getAll();
  }

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Message save(@RequestBody Message m) {
    return messageService.save(m);
  }
}
