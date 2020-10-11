package com.juan.book.entity.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.book.entity.dao.IBookDao;
import com.juan.book.entity.models.Book;

@Service
public class BookServicelmpl implements IBookService {

	@Autowired
	IBookDao bookDao;
	
	@Override
	public List<Book> getAll() {
		return (List<Book>) bookDao.findAll();
	}

	@Override
	public void addBook(Book book) {
		bookDao.save(book);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteById(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		Optional<Book> b = bookDao.findById(id);
		
		if (b.isPresent()) {
			book.setId(id);
			bookDao.save(book);
		}
	}

}
