package com.revisionsapin.revisionsapin.Repository;

import com.revisionsapin.revisionsapin.Entity.BonDeCommandeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonDeCommandeRepository extends CrudRepository<BonDeCommandeEntity, Long> {

}
