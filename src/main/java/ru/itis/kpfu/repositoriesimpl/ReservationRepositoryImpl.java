package ru.itis.kpfu.repositoriesimpl;

import ru.itis.kpfu.entities.Reservation;
import ru.itis.kpfu.repositories.ReservationRepository;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public class ReservationRepositoryImpl implements ReservationRepository {
    Connection connection = ru.itis.kpfu.helpers.DBConnectionHelper.getConnection();
    Reservation reservation;

    public void addReservation(Reservation reservation) {

    }

    public void removeReservation(Reservation reservation) {

    }

    public void updateReservation(Reservation reservation) {

    }

    public List<Reservation> getReservations() {
        return null;
    }
}
