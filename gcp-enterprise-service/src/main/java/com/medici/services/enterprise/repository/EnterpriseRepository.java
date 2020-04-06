package com.medici.services.enterprise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.enterprise.model.Enterprise;

@RepositoryRestResource
public interface EnterpriseRepository extends CrudRepository<Enterprise, String> {

}
