package com.cgi.boot.lab2;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long>{
}