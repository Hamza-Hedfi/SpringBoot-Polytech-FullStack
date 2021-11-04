package edu.polytech.ch6_tp3.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String label;
    private Integer capacity;

    @ManyToMany(mappedBy = "groups")
    private List<User> users = new ArrayList<>();

    public Groupe() {
    }

    public Groupe(Integer id, String label, Integer capacity) {
        this.id = id;
        this.label = label;
        this.capacity = capacity;
    }

    public Groupe(String label, Integer capacity) {
        this.label = label;
        this.capacity = capacity;
    }

    public Groupe(Integer id, String label, Integer capacity, List<User> users) {
        this.id = id;
        this.label = label;
        this.capacity = capacity;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Groupe{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
