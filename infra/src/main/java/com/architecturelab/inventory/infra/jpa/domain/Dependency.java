package com.architecturelab.inventory.infra.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inve_dependencia")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dependency implements Serializable {

    private static final long serialVersionUID = 1L;

    public Dependency(Long id) {
        this.id = id;
    }

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="vigente")
    private String vigente;
}
