package com.gaziatabey.App.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    private String id;
    private String name;
    private String surName;



}
