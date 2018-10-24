package com.software.miedo.jimmyapp.model;

import java.util.Date;

public class Noticia {

    private int category;
    private String title;
    private String description;
    private Date fecha;
    private String urlImage;


    public Noticia(int category, String title, String description, Date fecha, String urlImage) {
        this.category = category;
        this.title = title;
        this.description = description;
        this.fecha = fecha;
        this.urlImage = urlImage;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "category=" + category +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", fecha=" + fecha +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
