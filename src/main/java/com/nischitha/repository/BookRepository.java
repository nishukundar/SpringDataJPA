package com.nischitha.repository;

import org.springframework.data.repository.CrudRepository;

import com.nischitha.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
 