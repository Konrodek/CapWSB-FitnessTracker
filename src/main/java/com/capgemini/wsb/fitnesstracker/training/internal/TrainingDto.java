package com.capgemini.wsb.fitnesstracker.training.internal;

import java.util.Date;

/**
 * Obiekt transferu danych (DTO) dla treningów w systemie FitnessTracker.
 * Wykorzystywany jest do przekazywania informacji o treningach między warstwami aplikacji.
 * Izoluje warstwę logiki biznesowej od szczegółów implementacji modelu danych.
 */

public class TrainingDto {
    private Long id;
    private Date startTime;
    private Date endTime;
    private String activityType;
    private Double distance;
    private Double averageSpeed;



    public TrainingDto() {
    }

    /**
     * Konstruktor parametryczny dla obiektu TrainingDto.
     * @param id Unikalny identyfikator treningu.
     * @param startTime Czas rozpoczęcia treningu.
     * @param endTime Czas zakończenia treningu.
     * @param activityType Typ aktywności treningowej.
     * @param distance Dystans pokonany podczas treningu.
     * @param averageSpeed Średnia prędkość osiągnięta podczas treningu.
     */

    public TrainingDto(Long id, Date startTime, Date endTime, String activityType, Double distance, Double averageSpeed) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getActivityType() {
        return activityType;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getAverageSpeed() {
        return averageSpeed;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    /**
     * Zwraca tekstową reprezentację obiektu TrainingDto.
     * @return Tekstowa reprezentacja wartości wszystkich pól w obiekcie.
     */

    @Override
    public String toString() {
        return "TrainingDto{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", activityType='" + activityType + '\'' +
                ", distance=" + distance +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
