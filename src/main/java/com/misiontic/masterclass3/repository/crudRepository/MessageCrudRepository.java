package com.misiontic.masterclass3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.misiontic.masterclass3.entities.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer>  {
    
}
