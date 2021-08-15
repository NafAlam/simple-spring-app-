package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
