package com.cursojava.secao14.criacaoexecaopersonalizada.entities;

import com.cursojava.secao14.criacaoexecaopersonalizada.model.exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkin;
    private Date chekout;


    public Reservation(Integer roomNumber, Date checkin, Date chekout) {
        if (!chekout.after(checkin)) { // Progrmação Defenseiva.
            throw new DomainException(" Check-out date must be after check-in date") ;
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.chekout = chekout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getChekout() {
        return chekout;
    }


    public Long duration(){
        long diff = chekout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);

    }

    public void updateDates(Date checkin, Date chekout) {

        Date now = new Date();

        if (checkin.before(now) || chekout.before(now)){
            throw new DomainException
                    ("Reservation dates for update must be future dates") ;
        }
        if (!chekout.after(checkin)) {
             throw new DomainException(" Check-out date must be after check-in date") ;
        }
        this.checkin = checkin;
        this.chekout = chekout;

    }


    @Override
    public String toString() {
        return "Reservation:" +
                "Room " + roomNumber +
                ", check-in: " + sdf.format(checkin) +
                ", chek-out:" + sdf.format(chekout) +", "
                + duration() + " nights";
    }
}
