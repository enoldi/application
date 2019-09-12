package com.prim4s.application.repository;

import com.prim4s.application.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findBookByTitle(String title);
}
