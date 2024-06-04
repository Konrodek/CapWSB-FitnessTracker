package com.capgemini.wsb.fitnesstracker.training.internal;

/**
 * Enum definiujacy typy aktynowsci dostepne w systemie FitnessTracker.
 * Wszystkie rodzaje aktywnosci posiadaja opis, ktory jest wykorzystywany w interfejsie uzytkownika i logice aplikacji
 */

public enum ActivityType {

    RUNNING("Running"),
    CYCLING("Cycling"),
    WALKING("Walking"),
    SWIMMING("Swimming"),
    TENNIS("Tenis");

    private final String displayName;

    /**
     * Konstruktor dla rodzaju aktynowsxci, przypisuje nazwe dla każdego typu.
     * @param displayName Tekstowa reprezentacja rodzaju aktywnosci, uzywana na interfejsie uzytkownika.
     */


    ActivityType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Tekstową reprezentację typu aktywnosci.
     * @return Nazwa aktywności odpowiednia do wyświetlania.
     */



    public String getDisplayName() {
        return displayName;
    }

}
