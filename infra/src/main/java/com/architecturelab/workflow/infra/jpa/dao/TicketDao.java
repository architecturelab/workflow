package com.architecturelab.workflow.infra.jpa.dao;

import com.architecturelab.workflow.infra.jpa.domain.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Long> {
}
