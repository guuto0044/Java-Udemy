package com.cursojava.secao17.exercicioresolvidoSet.entities;

import java.util.Date;
import java.util.Objects;

public class Users {

    private String username;
    private Date date;

    public Users(String username, Date date) {
        this.username = username;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(username, users.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }
}
