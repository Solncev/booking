package ru.itis.kpfu.entities;


/**
 * Created by Liia on 30.10.2016.
 */
public class Reservation {

    private Long id;
    private Long guest_id;
    private Long room_id;
    private Long settlment_date;
    private Long eviction_date;

    public Reservation(Long id, Long guest_id, Long room_id, Long settlment_date, Long eviction_date) {
        this.id = id;
        this.guest_id = guest_id;
        this.room_id = room_id;
        this.settlment_date = settlment_date;
        this.eviction_date = eviction_date;
    }

    public Reservation(Long guest_id, Long room_id, Long settlment_date, Long eviction_date) {
        this.guest_id = guest_id;
        this.room_id = room_id;
        this.settlment_date = settlment_date;
        this.eviction_date = eviction_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Long guest_id) {
        this.guest_id = guest_id;
    }

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public Long getSettlment_date() {
        return settlment_date;
    }

    public void setSettlment_date(Long settlment_date) {
        this.settlment_date = settlment_date;
    }

    public Long getEviction_date() {
        return eviction_date;
    }

    public void setEviction_date(Long eviction_date) {
        this.eviction_date = eviction_date;
    }
}
