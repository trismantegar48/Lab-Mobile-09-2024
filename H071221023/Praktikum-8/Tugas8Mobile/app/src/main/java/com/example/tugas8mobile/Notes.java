package com.example.tugas8mobile;

import android.os.Parcelable;

public class Notes {

    private int id;
    private String judul;
    private String deskripsi;
    private String createdAt;
    private String updatedAt;

    public Notes(int id, String judul, String deskripsi, String createdAt, String updatedAt) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }
    public String getJudul() {
        return judul;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }
}
