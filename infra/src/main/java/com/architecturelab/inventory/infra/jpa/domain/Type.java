package com.architecturelab.inventory.infra.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "inve_clase")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {

    private static final long serialVersionUID = 1L;

    public Type(Long id) {
        this.id = id;
    }

    public Type(String nombre, String vidaUtil, String vigente) {
        this.nombre = nombre;
        this.vidaUtil = vidaUtil;
        this.vigente = vigente;
    }

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="vida_util")
    private String vidaUtil;

    @Column(name="vigente")
    private String vigente;
}
