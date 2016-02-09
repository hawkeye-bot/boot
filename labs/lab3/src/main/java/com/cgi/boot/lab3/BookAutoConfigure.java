package com.cgi.boot.lab3;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "my.book.autoconfigure", havingValue = "true", matchIfMissing = true)
public class BookAutoConfigure {
	@Autowired
	private BookRepo repo;

	@PostConstruct
	public void init() {
		Book b = new Book();
		b.setId(2L);
		b.setTitle("My First Book!");
		b.setIsbn("ISBN-1234");
		repo.save(b);
	}
}
