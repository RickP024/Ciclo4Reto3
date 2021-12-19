package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Supplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.SupplementsCrudRepository;

@Repository
public class SupplementsRepository {
    @Autowired
    private SupplementsCrudRepository repository;
    public List<Supplements> getAll() {
        return repository.findAll();
    }
    public Optional<Supplements> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Supplements create(Supplements clothe) {
        return repository.save(clothe);
    }
    public void update(Supplements clothe) {
        repository.save(clothe);
    }
    public void delete(Supplements clothe) {
        repository.delete(clothe);
    }
}
