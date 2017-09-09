package com.training.microservicesBoot.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@Entity
public class Team {

    @Id @GeneratedValue
    Long Id;
    String name;
    String location;
    String mascotte;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> players;

    public Team() {
        super();
    }

    public Team(String location, String name, Set<Player> players) {
        this();

        this.location = location;
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
