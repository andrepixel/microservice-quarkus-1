package org.andrepixel.models;

import java.util.Arrays;

import org.andrepixel.enums.ClassificationMovie;
import org.andrepixel.enums.TypeOfMovie;

public class MovieModel {
    private  String name;
    private  String author;
    private  String year;
    private  String company;
    private  String resume;
    private  String[] movieCast;
    private  TypeOfMovie[] typeOfMovie;
    private  ClassificationMovie classificationMovie;
    
    public MovieModel() {}

    public String getName() {
        return name;
    }

    public void setName(
            String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(
            String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(
            String year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(
            String company) {
        this.company = company;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(
            String resume) {
        this.resume = resume;
    }

    public String[] getMovieCast() {
        return movieCast;
    }

    public void setMovieCast(
            String[] movieCast) {
        this.movieCast = movieCast;
    }

    public TypeOfMovie[] getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(
            TypeOfMovie[] typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public ClassificationMovie getClassificationMovie() {
        return classificationMovie;
    }

    public void setClassificationMovie(
            ClassificationMovie classificationMovie) {
        this.classificationMovie = classificationMovie;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((name == null)
                        ? 0
                        : name.hashCode());
        result = prime
                * result
                + ((author == null)
                        ? 0
                        : author.hashCode());
        result = prime
                * result
                + ((year == null)
                        ? 0
                        : year.hashCode());
        result = prime
                * result
                + ((company == null)
                        ? 0
                        : company
                                .hashCode());
        result = prime
                * result
                + ((resume == null)
                        ? 0
                        : resume.hashCode());
        result = prime
                * result
                + Arrays.hashCode(
                        movieCast);
        result = prime
                * result
                + Arrays.hashCode(
                        typeOfMovie);
        result = prime
                * result
                + ((classificationMovie == null)
                        ? 0
                        : classificationMovie
                                .hashCode());
        return result;
    }

    @Override
    public boolean equals(
            Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj
                .getClass())
            return false;
        MovieModel other = (MovieModel) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name
                .equals(other.name))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author
                .equals(other.author))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year
                .equals(other.year))
            return false;
        if (company == null) {
            if (other.company != null)
                return false;
        } else if (!company
                .equals(other.company))
            return false;
        if (resume == null) {
            if (other.resume != null)
                return false;
        } else if (!resume
                .equals(other.resume))
            return false;
        if (!Arrays
                .equals(movieCast,
                        other.movieCast))
            return false;
        if (!Arrays
                .equals(typeOfMovie,
                        other.typeOfMovie))
            return false;
        if (classificationMovie != other.classificationMovie)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MovieModel [name="
                + name
                + ", author="
                + author
                + ", year="
                + year
                + ", company="
                + company
                + ", resume="
                + resume
                + ", movieCast="
                + Arrays.toString(
                        movieCast)
                + ", typeOfMovie="
                + Arrays.toString(
                        typeOfMovie)
                + ", classificationMovie="
                + classificationMovie
                + "]";
    }
 
    
}
