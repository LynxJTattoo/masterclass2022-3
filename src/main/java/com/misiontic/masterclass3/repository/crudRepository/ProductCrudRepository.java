package com.misiontic.masterclass3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.misiontic.masterclass3.entities.Product;

public interface ProductCrudRepository extends CrudRepository<Product,Integer>  {
    
}
