package com.architecturelab.workflow.core.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TicketInput {

    private Long ticketId;

    private Long activoId;

    private String estado;

    private Long diagnosticoId;

    private Long evaluacionId;

    private Long reparacionId;

    private Date fechaDiagnostico;

    private Date fechaEvaluacion;

    private Date fechaReparacion;

    private Date fechaCierre;

    private String usuarioCreacion;

    private Date fechaCreacion;

    private String usuarioModifica;
}
