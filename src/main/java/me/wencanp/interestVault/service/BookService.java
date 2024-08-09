package me.wencanp.interestVault.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import me.wencanp.interestVault.entity.Book;
import me.wencanp.interestVault.repository.BookRepository;

@Service
public class BookService {
	@Autowired
    private BookRepository bookRepository;

	public Book getBookByIsbn(String id) {
        return bookRepository.findById(id).orElse(null);
    }
} 
