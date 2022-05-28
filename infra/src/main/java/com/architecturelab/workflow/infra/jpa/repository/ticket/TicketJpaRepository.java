package com.architecturelab.workflow.infra.jpa.repository.ticket;

import com.architecturelab.workflow.infra.jpa.domain.Ticket;

import java.util.Optional;

public interface TicketJpaRepository {

    public Ticket save(Ticket entity);

    public Iterable<Ticket> getAll();

    public Optional<Ticket> getById(Long id);

}
