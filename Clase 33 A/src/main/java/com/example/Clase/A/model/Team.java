package com.example.Clase.A.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Team {

    @Id
    @SequenceGenerator(name = "team_sequense", sequenceName = "team_sequense")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_sequense")
    private Long id;
    private String nombre;
    private String puesto;
    private int numero;
    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private Set<Player> players = new HashSet<>();

    public Team(String nombre, String puesto, int numero) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.numero = numero;
    }

    public Team() {
    }

    public Long getId() {
        return id;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
