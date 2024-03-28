package org.andrepixel.models;

import org.andrepixel.enums.ClassificationMovie;
import org.andrepixel.enums.TypeOfMovie;

public class MovieModel {
    public final String name;
    public final String author;
    public final String year;
    public final String company;
    public final String resume;
    public final String[] movieCast;
    public final TypeOfMovie[] typeOfMovie;
    public final ClassificationMovie classificationMovie;
    
    public MovieModel(
            String name,
            String author,
            String year,
            String company,
            String resume,
            String[] movieCast,
            TypeOfMovie[] typeOfMovie,
            ClassificationMovie classificationMovie) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.company = company;
        this.resume = resume;
        this.movieCast = movieCast;
        this.typeOfMovie = typeOfMovie;
        this.classificationMovie = classificationMovie;
    }
}
