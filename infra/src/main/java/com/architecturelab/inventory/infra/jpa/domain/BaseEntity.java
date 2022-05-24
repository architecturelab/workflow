package com.architecturelab.inventory.infra.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;
}
