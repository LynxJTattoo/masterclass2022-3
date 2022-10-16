package com.misiontic.masterclass3.repository;

import com.misiontic.masterclass3.entities.Library;
import com.misiontic.masterclass3.repository.crudRepository.LibraryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryRepository {

  @Autowired
  private LibraryCrudRepository libraryCrudRepository;

  public List<Library> getAll() {
    return (List<Library>) libraryCrudRepository.findAll();
  }

  public Optional<Library> getLibrary(int id) {
    return libraryCrudRepository.findById(id);
  }

  public Library save(Library c) {
    return libraryCrudRepository.save(c);
  }

  public void delete(Library c) {
    libraryCrudRepository.delete(c);
  }


}
