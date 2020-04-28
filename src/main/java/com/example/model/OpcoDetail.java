package com.example.model;

import java.util.Date;

public class OpcoDetail {

    int id;
    String name;
    String region;
    String timezone;
    boolean active;
    Date goLiveDate;

    @Override
    public String toString() {
        return "opcoDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", timezone='" + timezone + '\'' +
                ", active=" + active +
                ", goLiveDate=" + goLiveDate +
                '}'+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getGoLiveDate() {
        return goLiveDate;
    }

    public void setGoLiveDate(Date goLiveDate) {
        this.goLiveDate = goLiveDate;
    }
}
