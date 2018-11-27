package com.ntl.movieapp.search.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.movieapp.search.model.Movie;
import com.ntl.movieapp.search.proxy.SearchMoviesProxy;
import com.ntl.movieapp.search.service.SearchService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class SearchController {
	
	@Autowired
	SearchService service;
	
	
	@Autowired
	SearchMoviesProxy searchProxy;


	public SearchController() {
		super();
	}



	public SearchController(SearchService serve) {
		super();
		service=serve;
	}



	@GetMapping("/searches/title/{title}")
	public List<Movie> searchListTitle(@PathVariable("title") String title){

		return searchProxy.searchMoviesByTitle(title);
		
		
	}
	
	@GetMapping("/searches/category/{category}")
	public List<Movie> searchListCategory(@PathVariable("category") String category){

		return searchProxy.searchMoviesByCategory(category);
		
		
	}
	
	@GetMapping("/searches/language/{language}")
	public List<Movie> searchListLanguage(@PathVariable("language") String language){

		return searchProxy.searchMoviesByLanguage(language);
		
		
	}
	

	
}
