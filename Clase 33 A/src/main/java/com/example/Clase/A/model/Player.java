package com.example.Clase.A.model;

import javax.persistence.*;

@Entity
@Table
public class Player {

    @Id
    @SequenceGenerator(name = "alumno_sequense", sequenceName = "alumno_sequense")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_sequense")
    private Long id;
    private String nombre;
    private String ciudad;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private Team team;


    public Player() {
    }

    public Player(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
