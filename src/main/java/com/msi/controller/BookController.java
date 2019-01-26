package com.msi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.msi.node.Book;
import com.msi.repository.BookRepository;
import com.msi.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/addBook")
	public boolean save(@RequestBody Book book) {
		return service.save(book);
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return service.findAll();
	}

	@GetMapping("/getBook/{name}")
	public Book getBook(@PathVariable String name) {
		return service.findByName(name);
	}

	@DeleteMapping("/deleteBook/{id}")
	public boolean deleteBook(@PathVariable Integer id) {
		return service.deleteById(id);
	}

}
