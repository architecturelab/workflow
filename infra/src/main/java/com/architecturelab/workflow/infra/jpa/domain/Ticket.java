package com.architecturelab.workflow.infra.jpa.domain;

import com.sun.tools.classfile.Dependency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.ui.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "work_ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;

    @Column(name = "activo_id")
    private Long activoId;

    @Column(name = "estado")
    private String estado;

    @Column(name = "diagnostico_id")
    private Long diagnosticoId;

    @Column(name = "evaluacion_id")
    private Long evaluacionId;

    @Column(name = "reparacion_id")
    private Long reparacionId;

    @Column(name = "fecha_diagnostico")
    private Date fechaDiagnostico;

    @Column(name = "fecha_evaluacion")
    private Date fechaEvaluacion;

    @Column(name = "fecha_reparacion")
    private Date fechaReparacion;

    @Column(name = "fecha_cierre")
    private Date fechaCierre;

    @Column(name = "usuario_creacion")
    private String usuarioCreacion;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "usuario_modifica")
    private String usuarioModifica;
}
