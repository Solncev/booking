package ru.itis.kpfu.repositories;

import ru.itis.kpfu.entities.Room;

import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public interface RoomRepository {
    void addRoom(Room room);

    void removeRoom(Room room);

    void updateRoom(Room room);

    List<Room> getRooms();
}
