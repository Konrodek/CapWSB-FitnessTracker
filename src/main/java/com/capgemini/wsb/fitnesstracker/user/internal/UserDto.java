package com.capgemini.wsb.fitnesstracker.user.internal;

import java.time.LocalDate;

/**
 * Obiekt Transferu Danych (DTO) reprezentujący informacje o użytkowniku.
 * Obiekt UserDto służy do przenoszenia danych użytkownika w aplikacji,
 * zapewniając wygodny sposób na enkapsulację i przekazywanie informacji o użytkowniku
 * między różnymi warstwami aplikacji.
 * @param id Unikalny identyfikator użytkownika.
 * @param firstName Imię użytkownika.
 * @param lastName Nazwisko użytkownika.
 * @param birthdate Data urodzenia użytkownika.
 * @param email Adres e-mail użytkownika.
 */

public record UserDto(Long id, String firstName, String lastName, LocalDate birthdate, String email) {}
