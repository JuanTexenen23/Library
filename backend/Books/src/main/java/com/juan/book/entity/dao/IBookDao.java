package com.juan.book.entity.dao;
import org.springframework.data.repository.CrudRepository;

import com.juan.book.entity.models.Book;

public interface IBookDao extends CrudRepository<Book, Integer> {

}
