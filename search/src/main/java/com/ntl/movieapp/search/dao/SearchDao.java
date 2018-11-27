package com.ntl.movieapp.search.dao;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ntl.movieapp.search.model.Movie;

@Repository
public interface SearchDao extends JpaRepository<Movie, Integer>{

	
	 
	
}
