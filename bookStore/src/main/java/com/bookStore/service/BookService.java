package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repositery.BookRepositery;

@Service
public class BookService {
	
	@Autowired
	private BookRepositery bRepo;
	 
	
	public void save(Book b) {
		((CrudRepository<Book, Integer>) bRepo).save(b);
	}

	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bRepo.findById(id).get();
		
	}
	
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
	
}
