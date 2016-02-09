package com.cgi.boot.lab3;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long>{
}