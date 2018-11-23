package com.ntl.movieapp.search.service;


import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;


import java.time.LocalDate;
import java.util.ArrayList;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import org.springframework.test.context.junit4.SpringRunner;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




import com.ntl.movieapp.search.dao.SearchDao;
import com.ntl.movieapp.search.model.Movie;

@RunWith(MockitoJUnitRunner.class)
public class SearchServiceTest {
	
	@Mock
	SearchDao dao;

	
	String stdate="12/11/2015";
	String startd[]=stdate.split("/");
	LocalDate dt=LocalDate.of(Integer.parseInt(startd[2]),Integer.parseInt(startd[1]), Integer.parseInt(startd[0]));
	

	Movie move=new Movie(5,"ishanya","jkbjb",dt,"kjbhjub");
	
	@Test
	public void testAllMoviesByTitle() {
	
		
		ArrayList<Movie> listing=new ArrayList();
		listing.add(move);
		
		when(dao.findMovies("kal")).thenReturn(listing);
		SearchService serve=new SearchService(dao);

		List<Movie> listingg=new ArrayList();
		listingg.add(move);
		listingg=serve.allMoviesByTitle("kal");
		
		assertEquals(1,listingg.size());

	
		
	}

	@Test
	public void testAllMoviesById() {
		List<Integer> listOfId=new ArrayList();
		listOfId.add(1);
		
		List<Movie> listing=new ArrayList();
		listing.add(move);
		
		when(dao.findAllById(listOfId)).thenReturn(listing);
		
	
		
		SearchService serve=new SearchService(dao);
		listing= serve.allMoviesById(listOfId);
		assertEquals(1,listing.size());
	}

}
