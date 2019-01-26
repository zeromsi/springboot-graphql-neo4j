package com.msi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.msi.node.Book;
import com.msi.repository.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepository;
	 
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}

	public boolean save(Book book) {
		try {
		bookRepository.save(book);
		return true;
		}catch(Exception e) {
		
		}
		return false;
	}

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return (List<Book>) bookRepository.findAll();
	}

	public Book findByName(String name) {
		return bookRepository.findByName(name);
	}

	public boolean deleteById(Integer id) {
		try {
			bookRepository.deleteById(id);
			return true;
			}catch(Exception e) {
			
			}
			return false;
	}

}
