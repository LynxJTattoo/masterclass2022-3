package com.misiontic.masterclass3.repository;

import com.misiontic.masterclass3.entities.Message;
import com.misiontic.masterclass3.repository.crudRepository.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

  @Autowired
  private MessageCrudRepository messageCrudRepository;

  public List<Message> getAll() {
    return (List<Message>) messageCrudRepository.findAll();
  }

  public Optional<Message> getMessage(int id) {
    return messageCrudRepository.findById(id);
  }

  public Message save(Message m) {
    return messageCrudRepository.save(m);
  }

  public void delete(Message m) {
    messageCrudRepository.delete(m);
  }
}
