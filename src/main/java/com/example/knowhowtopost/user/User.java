package com.example.knowhowtopost.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    @Getter
    @Setter
    private String login;

    @Column
    @Getter
    @Setter
    private String password;

}
