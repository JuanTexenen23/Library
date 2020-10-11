package com.juan.book.entity.services;

import java.util.List;

import com.juan.book.entity.models.Book;

public interface  IBookService {
	public List<Book> getAll();

	public void addBook(Book book);

	public void deleteBook(int id);

	public void updateBook(int id, Book book);
}
