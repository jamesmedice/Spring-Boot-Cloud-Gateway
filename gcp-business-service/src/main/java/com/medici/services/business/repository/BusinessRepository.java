package com.medici.services.business.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.business.model.Business;

@RepositoryRestResource
public interface BusinessRepository extends CrudRepository<Business, String> {

}
