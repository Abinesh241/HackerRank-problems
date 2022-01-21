package com.example.democrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "demotbl")
@Entity
public class Userentity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
}
