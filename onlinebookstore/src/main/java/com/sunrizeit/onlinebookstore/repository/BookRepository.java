package com.sunrizeit.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunrizeit.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
