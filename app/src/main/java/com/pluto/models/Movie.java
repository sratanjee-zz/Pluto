package com.pluto.models;

import java.util.Date;

public class Movie {

    private String id, title, description, trailerUrl;
    private int duration; // in minutes

    private Date airDate, airTime;

    private AudienceRating audienceRating;
    private String[] theaters;

    public Movie(String id, String title, String description, String trailerUrl,
                 int duration, AudienceRating audienceRating, String[] theaters,
                 Date airDate, Date airTime) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.trailerUrl = trailerUrl;
        this.duration = duration;
        this.audienceRating = audienceRating;
        this.theaters = theaters;
        this.airDate = airDate;
        this.airTime = airTime;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    public Date getAirTime() {
        return airTime;
    }

    public void setAirTime(Date airTime) {
        this.airTime = airTime;
    }

    public AudienceRating getAudienceRating() {
        return audienceRating;
    }

    public void setAudienceRating(AudienceRating audienceRating) {
        this.audienceRating = audienceRating;
    }

    public String[] getTheaters() {
        return theaters;
    }

    public void setTheaters(String[] theaters) {
        this.theaters = theaters;
    }
}
