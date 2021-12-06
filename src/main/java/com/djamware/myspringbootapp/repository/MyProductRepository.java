package com.djamware.myspringbootapp.repository;

import com.djamware.myspringbootapp.entity.MyProduct;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MyProductRepository extends MongoRepository<MyProduct, Integer> {
}
