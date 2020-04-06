package com.medici.services.director.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.director.model.Director;

@RepositoryRestResource
public interface DirectorRepository extends CrudRepository<Director, String> {

}
