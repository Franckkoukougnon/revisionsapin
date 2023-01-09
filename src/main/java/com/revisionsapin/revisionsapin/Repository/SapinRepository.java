package com.revisionsapin.revisionsapin.Repository;


import com.revisionsapin.revisionsapin.Entity.SapinEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SapinRepository extends CrudRepository<SapinEntity, Long> {




}
