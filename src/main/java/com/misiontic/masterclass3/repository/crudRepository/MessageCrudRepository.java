package com.misiontic.masterclass3.repository.crudRepository;

import com.misiontic.masterclass3.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository
  extends CrudRepository<Message, Integer> {}
