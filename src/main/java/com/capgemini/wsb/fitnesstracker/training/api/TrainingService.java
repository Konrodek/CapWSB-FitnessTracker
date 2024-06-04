package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.api.Training;
import java.util.List;

/**
 * Interfejs pozwalajacy na zarzadznie treningiem.
 * Zawiera mozliwosci tworzenia, aktualizacji, pobierania i wyszukiwania treningow.
 */
public interface TrainingService {

    /**
     * Utworzenie treningu i zapisanie go w bazie.
     *
     * @param training Obiekt do zapisania.
     * @return Zapisany obiekt treningu.
     */
    Training createTraining(Training training);

    /**
     * Zwraca listę wszystkich treningow zarejestrowanych w systemie.
     *
     * @return Lista wszystkich treningów.
     */
    List<Training> findAllTrainings();

    /**
     * Znajduje wszystkie treningi odnoszace sie do konkretnego użytkownika.
     *
     * @param userId Identyfikator użytkownika, dla tego ID beda zwracane treningi.
     * @return Treningi przypisane do uzytkownika.
     */
    List<Training> findTrainingsByUserId(Long userId);

    /**
     * Wyszkuanie wszystkich treningow odbytych po wskazanej dacie.
     *
     * @param date Data w String, określająca minimalną datę zakończenia treningów do wyszukania.
     * @return Treningi zakonczone po podanej dacie.
     */
    List<Training> findCompletedTrainings(String date);

    /**
     * Znajdowanie treningow na podstawie typu aktywnosci.
     *
     * @param activityType Typ aktywnosci wg ktorego maja byc znajdowane treningi.
     * @return Treningi odpowiadające podanemu typowi aktywnosci.
     */
    List<Training> findTrainingsByActivityType(String activityType);

    /**
     * Aktualizacja treningu na podstawie dostarczonego obiektu treningu.
     *
     * @param trainingId Identyfikator treningu, ktory ma zostac zaktualizowany.
     * @param training Obiekt treningu z nowymi danymi.
     * @return Zaktualizowany obiekt treningu.
     */
    Training updateTraining(Long trainingId, Training training);
}