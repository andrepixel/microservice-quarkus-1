package org.andrepixel.models;

import java.time.LocalDateTime;

import org.andrepixel.enums.State;
import org.andrepixel.enums.TypeSection;

public class SectionModel {
    private String codeSection;
    private Integer quantityOfArmChair;
    private MovieModel movie;
    private LocalDateTime dateOfSection;
    private String localOfSection;
    private State state;
    private Boolean isPreLaunch;
    private TypeSection typeSection;

    public SectionModel() {}

    public String getCodeSection() {
        return codeSection;
    }

    public void setCodeSection(
            String codeSection) {
        this.codeSection = codeSection;
    }

    public Integer getQuantityOfArmChair() {
        return quantityOfArmChair;
    }

    public void setQuantityOfArmChair(
            Integer quantityOfArmChair) {
        this.quantityOfArmChair = quantityOfArmChair;
    }

    public MovieModel getMovie() {
        return movie;
    }

    public void setMovie(
            MovieModel movie) {
        this.movie = movie;
    }

    public LocalDateTime getDateOfSection() {
        return dateOfSection;
    }

    public void setDateOfSection(
            LocalDateTime dateOfSection) {
        this.dateOfSection = dateOfSection;
    }

    public String getLocalOfSection() {
        return localOfSection;
    }

    public void setLocalOfSection(
            String localOfSection) {
        this.localOfSection = localOfSection;
    }

    public State getState() {
        return state;
    }

    public void setState(
            State state) {
        this.state = state;
    }

    public Boolean getIsPreLaunch() {
        return isPreLaunch;
    }

    public void setIsPreLaunch(
            Boolean isPreLaunch) {
        this.isPreLaunch = isPreLaunch;
    }

    public TypeSection getTypeSection() {
        return typeSection;
    }

    public void setTypeSection(
            TypeSection typeSection) {
        this.typeSection = typeSection;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((codeSection == null)
                        ? 0
                        : codeSection
                                .hashCode());
        result = prime
                * result
                + ((quantityOfArmChair == null)
                        ? 0
                        : quantityOfArmChair
                                .hashCode());
        result = prime
                * result
                + ((movie == null)
                        ? 0
                        : movie.hashCode());
        result = prime
                * result
                + ((dateOfSection == null)
                        ? 0
                        : dateOfSection
                                .hashCode());
        result = prime
                * result
                + ((localOfSection == null)
                        ? 0
                        : localOfSection
                                .hashCode());
        result = prime
                * result
                + ((state == null)
                        ? 0
                        : state.hashCode());
        result = prime
                * result
                + ((isPreLaunch == null)
                        ? 0
                        : isPreLaunch
                                .hashCode());
        result = prime
                * result
                + ((typeSection == null)
                        ? 0
                        : typeSection
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
        SectionModel other = (SectionModel) obj;
        if (codeSection == null) {
            if (other.codeSection != null)
                return false;
        } else if (!codeSection
                .equals(other.codeSection))
            return false;
        if (quantityOfArmChair == null) {
            if (other.quantityOfArmChair != null)
                return false;
        } else if (!quantityOfArmChair
                .equals(other.quantityOfArmChair))
            return false;
        if (movie == null) {
            if (other.movie != null)
                return false;
        } else if (!movie
                .equals(other.movie))
            return false;
        if (dateOfSection == null) {
            if (other.dateOfSection != null)
                return false;
        } else if (!dateOfSection
                .equals(other.dateOfSection))
            return false;
        if (localOfSection == null) {
            if (other.localOfSection != null)
                return false;
        } else if (!localOfSection
                .equals(other.localOfSection))
            return false;
        if (state != other.state)
            return false;
        if (isPreLaunch == null) {
            if (other.isPreLaunch != null)
                return false;
        } else if (!isPreLaunch
                .equals(other.isPreLaunch))
            return false;
        if (typeSection != other.typeSection)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SectionModel [codeSection="
                + codeSection
                + ", quantityOfArmChair="
                + quantityOfArmChair
                + ", movie="
                + movie
                + ", dateOfSection="
                + dateOfSection
                + ", localOfSection="
                + localOfSection
                + ", state="
                + state
                + ", isPreLaunch="
                + isPreLaunch
                + ", typeSection="
                + typeSection
                + "]";
    }
}
