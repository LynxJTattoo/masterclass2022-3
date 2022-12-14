package com.misiontic.masterclass3.repository;

import com.misiontic.masterclass3.entities.Client;
import com.misiontic.masterclass3.repository.crudRepository.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {

  @Autowired
  private ClientCrudRepository clientCrudRepository;

  public List<Client> getAll() {
    return (List<Client>) clientCrudRepository.findAll();
  }

  public Optional<Client> getClient(int id) {
    return clientCrudRepository.findById(id);
  }

  public Client save(Client a) {
    return clientCrudRepository.save(a);
  }

  public void delete(Client a) {
    clientCrudRepository.delete(a);
  }
}
