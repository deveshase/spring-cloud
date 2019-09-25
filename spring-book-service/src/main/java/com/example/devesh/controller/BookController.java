package com.example.devesh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.devesh.model.Book;

@RestController
public class BookController {

	private static List<Book> bookList = new ArrayList<>();

	static {
		bookList.add(new Book(1, "Clouds of Witness", "Dorothy L. Sayers"));
		bookList.add(new Book(2, "A Glass of Blessings", "Barbara Pym"));
		bookList.add(new Book(3, "In a Dry Season", "Peter Robinson"));
	}

	@GetMapping("/books")
	public ResponseEntity<?> getBookList() {
		return ResponseEntity.ok(bookList);
	}
}
