package ru.itis.kpfu.repositories;

import ru.itis.kpfu.entities.Hotel;

import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public interface HotelRepository {
    void addHotel(Hotel hotel);

    void removeHotel(Hotel hotel);

    void updateHotel(Hotel hotel);

    List<Hotel> getHotels();
}
