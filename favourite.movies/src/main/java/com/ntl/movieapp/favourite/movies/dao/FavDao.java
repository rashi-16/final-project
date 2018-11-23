package com.ntl.movieapp.favourite.movies.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.movieapp.favourite.movies.model.Favourites;


@Repository
public interface FavDao extends JpaRepository<Favourites,Integer>{
	
}
