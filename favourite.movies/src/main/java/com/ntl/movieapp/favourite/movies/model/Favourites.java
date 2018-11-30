package com.ntl.movieapp.favourite.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class Favourites {
	
	
	
	 public Favourites() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int favouriteId;
	 	
	private int movieId;
	
	private String userId;
	
	@Transient
	private String movieName;
	
	@Transient
	private String moviePosterUrl;
	@Transient
	private String movieReleaseDate;
	@Transient
	private int movieAgeLimit;
	
	@Transient
	 private String moviecategory;
	@Transient
	 private String movieVideoUrl;
	@Transient
	 private String movieLanguage;
	

	
	
	

	public int getMovieAgeLimit() {
		return movieAgeLimit;
	}





	public void setMovieAgeLimit(int movieAgeLimit) {
		this.movieAgeLimit = movieAgeLimit;
	}





	public String getMoviecategory() {
		return moviecategory;
	}





	public void setMoviecategory(String moviecategory) {
		this.moviecategory = moviecategory;
	}





	public String getMovieVideoUrl() {
		return movieVideoUrl;
	}





	public void setMovieVideoUrl(String movieVideoUrl) {
		this.movieVideoUrl = movieVideoUrl;
	}





	public String getMovieLanguage() {
		return movieLanguage;
	}





	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}





	public Favourites(int favouriteId,int movieId,String userId) {
		super();
		this.favouriteId = favouriteId;
		this.movieId = movieId;
		this.userId = userId;
	}





	public Favourites(@NotNull int movieId, @NotNull String userId) {
		super();
		this.movieId = movieId;
		this.userId = userId;
	}




	public int getFavouriteId() {
		return favouriteId;
	}



	public void setFavouriteId(int favouriteId) {
		this.favouriteId = favouriteId;
	}



	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



	
	public String getMovieName() {
		return movieName;
	}





	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}





	public String getMoviePosterUrl() {
		return moviePosterUrl;
	}





	public void setMoviePosterUrl(String moviePosterUrl) {
		this.moviePosterUrl = moviePosterUrl;
	}





	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}





	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}





	

	
}
