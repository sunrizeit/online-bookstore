package com.sunrizeit.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunrizeit.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "booksCategory",path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
