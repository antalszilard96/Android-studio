package com.example.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Work {
    private List<Work> data;
    @SerializedName("id")
    @Expose int id;
    @SerializedName("name")
    @Expose String name;

    public Work(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Work() {
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

    public List<Work> getData() {
        return data;
    }

    public void setData(List<Work> data) {
        this.data = data;
    }
}
