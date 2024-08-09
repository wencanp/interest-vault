package me.wencanp.interestVault.controller;

import me.wencanp.interestVault.service.BookService;
import me.wencanp.interestVault.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/books")
public class BookController {
	@Autowired BookService bookService;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Book getBookByIsbn(@PathVariable String id) {
        return bookService.getBookByIsbn(id);
    }
}
