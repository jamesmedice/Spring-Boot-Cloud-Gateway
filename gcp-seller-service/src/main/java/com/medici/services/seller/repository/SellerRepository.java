package com.medici.services.seller.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.seller.model.Seller;

@RepositoryRestResource
public interface SellerRepository extends CrudRepository<Seller, String> {

}
