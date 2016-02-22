package com.cgi.boot.lab3autoconfigure;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cgi.boot.lab3lib.Book;
import com.cgi.boot.lab3lib.BookRepo;

@Configuration
@ConditionalOnProperty(value = "my.book.autoconfigure", havingValue = "true", matchIfMissing = true)
@EnableJpaRepositories(basePackages="com.cgi.boot.lab3lib")
@EntityScan(basePackages="com.cgi.boot.lab3lib")
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
