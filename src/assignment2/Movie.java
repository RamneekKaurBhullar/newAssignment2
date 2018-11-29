/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author ramneek kaur
 * Student Number 200393895
 */
public class Movie {
    /*
    * instance variables
   */
    private String movieName;
    private String language;
    private LocalDate releaseDate;
    private String productionHouse;
    private String genre;
     /**
     *
     * constructor for movie's information
     */
    public Movie(String movieName, String language, LocalDate releaseDate, String productionHouse, String genre)
    {
        setMovieName (movieName);
        setLanguage (language);
        setReleaseDate (releaseDate);
        setProductionHouse(productionHouse);
        setGenre (genre);
    }

    /**
     * get set method for movie name
     * validating that movie name is not be empty
     */

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        if(movieName.isEmpty())
            throw new IllegalArgumentException("Movie name should not be empty");
          else
        this.movieName = movieName;
    }
    /**
     * get set method for language
     * validating that language is filled
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
       if(language.isEmpty())
            throw new IllegalArgumentException("Movie's language should be filled");
          else
        this.language = language;
    }
    /**
     * get set method for Release Date
     * validating that Release Date is after January 1,2005 
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
       int dateRelease = Period.between(releaseDate, LocalDate.now()).getYears();
       if (releaseDate.isAfter(LocalDate.of(2005, Month.JANUARY, 1)) &&
            releaseDate.isBefore(LocalDate.now()))
            this.releaseDate = releaseDate;
   else
     throw new IllegalArgumentException("Release date should be after year 2005 ");
    }
    /**
     * get set method for production house
     * validating that production house is mentioned
     */
    public String getProductionHouse() {
        return productionHouse;
    }

    public void setProductionHouse(String productionHouse) {
         if(productionHouse.isEmpty())
            throw new IllegalArgumentException("Mention the Production House");
          else
        this.productionHouse = productionHouse;
}
    /**
     * get set method for genre
     * validating that genre is not be empty
     */
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
       if(genre.isEmpty())
            throw new IllegalArgumentException("Genre should not be empty");
          else
        this.genre = genre;
    }
         
    
}
