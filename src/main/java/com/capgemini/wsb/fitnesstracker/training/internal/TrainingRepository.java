package com.capgemini.wsb.fitnesstracker.training.internal;

import com.capgemini.wsb.fitnesstracker.training.api.Training;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Interfejs repozytorium JPA dla encji Training, umożliwiający dostęp do operacji bazodanowych.
 * Rozszerza JpaRepository, co zapewnia implementację standardowych metod CRUD oraz pozwala na definiowanie własnych zapytań.
 */
public interface TrainingRepository extends JpaRepository<Training, Long> {

    /**
     * Wyszukuje wszystkie treningi przypisane do określonego użytkownika na podstawie jego ID.
     * @param userId Identyfikator użytkownika, dla którego szukane są treningi.
     * @return Lista treningów przypisanych do użytkownika.
     */
    List<Training> findByUserId(Long userId);

    /**
     * Znajduje wszystkie treningi, które zakończyły się po określonej dacie.
     * @param endTime Data, po której treningi zostały zakończone.
     * @return Lista treningów, które zakończyły się po podanej dacie.
     */
    List<Training> findByEndTimeAfter(Date endTime);

    /**
     * Wyszukuje treningi według określonego typu aktywności.
     * @param activityType Typ aktywności, dla którego chcemy znaleźć treningi (np. Bieganie, Pływanie).
     * @return Lista treningów odpowiadających podanemu typowi aktywności.
     */
    List<Training> findByActivityType(String activityType);
}
