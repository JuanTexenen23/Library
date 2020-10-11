package com.juan.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.book.entity.models.Book;
import com.juan.book.entity.services.IBookService;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class BookController {
	@Autowired
	IBookService bookService;
	// Here are the end-points

	@GetMapping("/api/book")
	private List<Book> getAll(){
		return bookService.getAll();
	}
	
	@GetMapping("/api/book/{id}")
	private Book findById(@PathVariable(value = "id") int id) {
		return null;
	}
	
	@PostMapping("/api/book")
	private void addBook(Book book) {
		bookService.addBook(book);
	}
	
	@DeleteMapping("/api/book/{id}")
	private void deleteBook(@PathVariable(value = "id") int id) {
		bookService.deleteBook(id);
	}
	
	@PutMapping("/api/book/{id}")
	private void updateBook(@PathVariable(value = "id") int id, Book book) {
		bookService.updateBook(id, book);
	}
}
