package com.prorigo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prorigo.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
