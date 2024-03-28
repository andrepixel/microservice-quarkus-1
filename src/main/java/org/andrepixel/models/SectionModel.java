package org.andrepixel.models;

import java.time.LocalDateTime;

import org.andrepixel.enums.State;
import org.andrepixel.enums.TypeSection;

public class SectionModel {
    public final String codeSection;
    public final Integer quantityOfArmChair;
    public final MovieModel movie;
    public final LocalDateTime dateOfSection;
    public final String localOfSection;
    public final State state;
    public final Boolean isPreLaunch;
    public final TypeSection typeSection;

    public SectionModel(
            String codeSection,
            Integer quantityOfArmChair,
            MovieModel movie,
            LocalDateTime dateOfSection,
            String localOfSection,
            State state,
            Boolean isPreLaunch,
            TypeSection typeSection) {
        this.codeSection = codeSection;
        this.quantityOfArmChair = quantityOfArmChair;
        this.movie = movie;
        this.dateOfSection = dateOfSection;
        this.localOfSection = localOfSection;
        this.state = state;
        this.isPreLaunch = isPreLaunch;
        this.typeSection = typeSection;
    }

}
