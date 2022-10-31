/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioraulguanca.raul.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia_laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String position;
    private String company;
    private String img;
    private String modo;
    private String inicio;
    private String fin;
    private String timeElapsed;
    private String ubicacion;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(String position, String company, String img, String modo, String inicio, String fin, String timeElapsed, String ubicacion) {
        this.position = position;
        this.company = company;
        this.img = img;
        this.modo = modo;
        this.inicio = inicio;
        this.fin = fin;
        this.timeElapsed = timeElapsed;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(String timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
