package com.cgi.boot.lab2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	private BookRepo repo;
	
	@PostConstruct
	public void init()
	{
		Book b = new Book();
		b.setId(1L);
		b.setTitle("My First Book!");
		b.setIsbn("ISBN-1234");
		repo.save(b);
	}
	
	@RequestMapping("/")
	public Iterable<Book> home()
	{
		return repo.findAll();
	}
}
