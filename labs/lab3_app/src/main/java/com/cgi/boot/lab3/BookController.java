package com.cgi.boot.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.boot.lab3.Book;
import com.cgi.boot.lab3.BookRepo;

@RestController
public class BookController {
	@Autowired
	private BookRepo repo;
	
	@RequestMapping("/")
	public Iterable<Book> home()
	{
		return repo.findAll();
	}
}
