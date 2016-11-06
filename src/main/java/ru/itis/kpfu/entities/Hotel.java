package ru.itis.kpfu.entities;

/**
 * Created by Liia on 30.10.2016.
 */
public class Hotel {

    private Long id;
    private String name;
    private String address;
    private int stars;

    public Hotel(Long id, String name, String address, int stars) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.stars = stars;
    }

    public Hotel(String name, String address, int stars) {
        this.name = name;
        this.address = address;
        this.stars = stars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
