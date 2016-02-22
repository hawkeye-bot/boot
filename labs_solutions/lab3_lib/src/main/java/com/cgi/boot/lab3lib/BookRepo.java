package com.cgi.boot.lab3lib;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long>{
}