package com.misiontic.masterclass3.repository.crudRepository;

import com.misiontic.masterclass3.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {}
