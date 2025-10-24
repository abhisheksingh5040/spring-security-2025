package com.technoelevate.spring_security.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "authority")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "authority_name")
    private String name;

    @ManyToMany(mappedBy = "authorities")
    private List<User> users;
}
