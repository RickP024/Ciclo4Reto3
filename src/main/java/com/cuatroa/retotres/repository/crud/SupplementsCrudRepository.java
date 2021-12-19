package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplementsCrudRepository extends MongoRepository<Supplements, String> {
    
}
