package ru.itis.kpfu.repositoriesimpl;

import ru.itis.kpfu.entities.Room;
import ru.itis.kpfu.repositories.RoomRepository;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public class RoomRepositoryImpl implements RoomRepository {
    Connection connection = ru.itis.kpfu.helpers.DBConnectionHelper.getConnection();
    Room room;

    public void addRoom(Room room) {

    }

    public void removeRoom(Room room) {

    }

    public void updateRoom(Room room) {

    }

    public List<Room> getRooms() {
        return null;
    }
}
