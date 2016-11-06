package ru.itis.kpfu.repositories;

import ru.itis.kpfu.entities.Reservation;

import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public interface ReservationRepository {
    void addReservation(Reservation reservation);

    void removeReservation(Reservation reservation);

    void updateReservation(Reservation reservation);

    List<Reservation> getReservations();
}
