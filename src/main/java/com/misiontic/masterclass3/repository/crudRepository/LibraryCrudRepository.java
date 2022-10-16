package com.misiontic.masterclass3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.misiontic.masterclass3.entities.Library;

public interface LibraryCrudRepository extends CrudRepository<Library,Integer>{
    
}
