package com.example.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.User;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Integer>{
	public Page<User> findAll(Pageable pageable);
	public User findByName(String name);

}
