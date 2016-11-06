package ru.itis.kpfu.repositoriesimpl;

import ru.itis.kpfu.entities.Hotel;
import ru.itis.kpfu.repositories.HotelRepository;
import ru.itis.kpfu.helpers.*;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public class HotelRepositoryImpl implements HotelRepository {
    Connection connection = ru.itis.kpfu.helpers.DBConnectionHelper.getConnection();
    Hotel hotel;

    public void addHotel(Hotel hotel) {

    }

    public void removeHotel(Hotel hotel) {

    }

    public void updateHotel(Hotel hotel) {

    }

    public List<Hotel> getHotels() {
        return null;
    }
}
