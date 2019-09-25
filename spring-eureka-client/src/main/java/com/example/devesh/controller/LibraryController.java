package com.example.devesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.devesh.model.Book;

@RestController
public class LibraryController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/library", method = RequestMethod.GET)
	@ResponseBody
	public Book[] getRecommendedBook() {
		Book[] res = restTemplate.getForObject("http://book-service/books", Book[].class);
		return res;
	}
}
