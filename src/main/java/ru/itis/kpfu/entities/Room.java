package ru.itis.kpfu.entities;

/**
 * Created by Liia on 30.10.2016.
 */
public class Room {

    private Long id;
    private Long hotel_id;
    private String type;
    private int capacity;
    private int price;

    public Room(Long id, Long hotel_id, String type, int capacity, int price) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public Room(Long hotel_id, String type, int capacity, int price) {
        this.hotel_id = hotel_id;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
