package com.architecturelab.workflow.infra.jpa.repository.ticket;

import com.architecturelab.workflow.infra.jpa.dao.TicketDao;
import com.architecturelab.workflow.infra.jpa.domain.Ticket;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
@EnableJpaRepositories(basePackages = {"com.architecturelab.workflow"})
@EntityScan("com.architecturelab.workflow")
public class TicketJpaRepositoryImpl implements TicketJpaRepository {

    @Autowired
    private TicketDao itemDao;

    @Override
    public Ticket save(Ticket entity) {
        return itemDao.save(entity);
    }

    @Override
    public Iterable<Ticket> getAll() {
        return itemDao.findAll();
    }

    @Override
    public Optional<Ticket> getById(Long id) {
        return itemDao.findById(id);
    }
}
