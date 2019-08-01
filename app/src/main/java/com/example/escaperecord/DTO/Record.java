package com.example.escaperecord.DTO;

import android.graphics.Bitmap;

import java.sql.Time;
import java.util.Date;

public class Record {
    private int code;
    private int themecode;
    private Bitmap es_image;
    private Date es_date;
    private int es_retry;
    private boolean es_yorn;
    private Time es_time;
    private int es_percent;
    private int es_hint;
    private String es_hintnote;
    private int es_rank;
    private String es_best;
    private String es_worst;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getThemecode() {
        return themecode;
    }

    public void setThemecode(int themecode) {
        this.themecode = themecode;
    }

    public Bitmap getEs_image() {
        return es_image;
    }

    public void setEs_image(Bitmap es_image) {
        this.es_image = es_image;
    }

    public Date getEs_date() {
        return es_date;
    }

    public void setEs_date(Date es_date) {
        this.es_date = es_date;
    }

    public int getEs_retry() {
        return es_retry;
    }

    public void setEs_retry(int es_retry) {
        this.es_retry = es_retry;
    }

    public boolean isEs_yorn() {
        return es_yorn;
    }

    public void setEs_yorn(boolean es_yorn) {
        this.es_yorn = es_yorn;
    }

    public Time getEs_time() {
        return es_time;
    }

    public void setEs_time(Time es_time) {
        this.es_time = es_time;
    }

    public int getEs_percent() {
        return es_percent;
    }

    public void setEs_percent(int es_percent) {
        this.es_percent = es_percent;
    }

    public int getEs_hint() {
        return es_hint;
    }

    public void setEs_hint(int es_hint) {
        this.es_hint = es_hint;
    }

    public String getEs_hintnote() {
        return es_hintnote;
    }

    public void setEs_hintnote(String es_hintnote) {
        this.es_hintnote = es_hintnote;
    }

    public int getEs_rank() {
        return es_rank;
    }

    public void setEs_rank(int es_rank) {
        this.es_rank = es_rank;
    }

    public String getEs_best() {
        return es_best;
    }

    public void setEs_best(String es_best) {
        this.es_best = es_best;
    }

    public String getEs_worst() {
        return es_worst;
    }

    public void setEs_worst(String es_worst) {
        this.es_worst = es_worst;
    }

    public Record(int code, int themecode, Bitmap es_image, Date es_date, int es_retry, boolean es_yorn, Time es_time, int es_percent, int es_hint, String es_hintnote, int es_rank, String es_best, String es_worst) {
        this.code = code;
        this.themecode = themecode;
        this.es_image = es_image;
        this.es_date = es_date;
        this.es_retry = es_retry;
        this.es_yorn = es_yorn;
        this.es_time = es_time;
        this.es_percent = es_percent;
        this.es_hint = es_hint;
        this.es_hintnote = es_hintnote;
        this.es_rank = es_rank;
        this.es_best = es_best;
        this.es_worst = es_worst;
    }
}
