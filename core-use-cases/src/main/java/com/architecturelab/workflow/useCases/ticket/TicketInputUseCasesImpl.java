package com.architecturelab.workflow.useCases.ticket;

import com.architecturelab.workflow.core.domain.item.TicketInput;
import com.architecturelab.workflow.infra.jpa.domain.Ticket;
import com.architecturelab.workflow.infra.jpa.repository.ticket.TicketJpaRepository;
import com.sun.tools.classfile.Dependency;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketInputUseCasesImpl implements TicketInputUseCases {

    @Autowired
    private TicketJpaRepository ticketJpaRepository;

    @Override
    public TicketInput create(TicketInput ticketInput) {
        Ticket ticket = ticketJpaRepository.save(new Ticket(
                ticketInput.getTicketId(),
                ticketInput.getActivoId(),
                ticketInput.getEstado(),
                ticketInput.getDiagnosticoId(),
                ticketInput.getEvaluacionId(),
                ticketInput.getReparacionId(),
                ticketInput.getFechaDiagnostico(),
                ticketInput.getFechaEvaluacion(),
                ticketInput.getFechaReparacion(),
                ticketInput.getFechaCierre(),
                ticketInput.getUsuarioCreacion(),
                ticketInput.getFechaCreacion(),
                ticketInput.getUsuarioModifica()
        ));
        TicketInput input = new TicketInput(
                ticket.getId(),
                ticket.getActivoId(),
                ticket.getEstado(),
                ticket.getDiagnosticoId(),
                ticket.getEvaluacionId(),
                ticket.getReparacionId(),
                ticket.getFechaDiagnostico(),
                ticket.getFechaEvaluacion(),
                ticket.getFechaReparacion(),
                ticket.getFechaCierre(),
                ticket.getUsuarioCreacion(),
                ticket.getFechaCreacion(),
                ticket.getUsuarioModifica()
        );
        return input;
    }

    @Override
    public TicketInput update(TicketInput ticketInput) {
        Optional<Ticket> ticketData = ticketJpaRepository.getById(ticketInput.getTicketId());
        if (ticketData.isPresent()){
            Ticket ticket = ticketData.get();
            ticket.setActivoId(ticketInput.getActivoId());
            ticket.setEstado(ticketInput.getEstado());
            ticket.setDiagnosticoId(ticketInput.getDiagnosticoId());
            ticket.setEvaluacionId(ticketInput.getEvaluacionId());
            ticket.setReparacionId(ticketInput.getReparacionId());
            ticket.setFechaDiagnostico(ticketInput.getFechaDiagnostico());
            ticket.setFechaEvaluacion(ticketInput.getFechaEvaluacion());
            ticket.setFechaReparacion(ticketInput.getFechaReparacion());
            ticket.setFechaCierre(ticketInput.getFechaCierre());
            ticket.setUsuarioCreacion(ticketInput.getUsuarioCreacion());
            ticket.setFechaCreacion(ticketInput.getFechaCreacion());
            ticket.setUsuarioModifica(ticketInput.getUsuarioModifica());

            com.architecturelab.workflow.infra.jpa.domain.Ticket updated = ticketJpaRepository.save(ticket);
            TicketInput input = new TicketInput(
                    updated.getId(),
                    updated.getActivoId(),
                    updated.getEstado(),
                    updated.getDiagnosticoId(),
                    updated.getEvaluacionId(),
                    updated.getReparacionId(),
                    updated.getFechaDiagnostico(),
                    updated.getFechaEvaluacion(),
                    updated.getFechaReparacion(),
                    updated.getFechaCierre(),
                    updated.getUsuarioCreacion(),
                    updated.getFechaCreacion(),
                    updated.getUsuarioModifica()
            );
            return input;
        }
        return null;
    }

    @Override
    public List<TicketInput> getAll() {
        List<Ticket> tickets = (List<Ticket>) ticketJpaRepository.getAll();

        List<TicketInput> inputs = new ArrayList<TicketInput>();

        tickets.forEach(i -> {
            TicketInput ticket = new TicketInput(
                    i.getId(),
                    i.getActivoId(),
                    i.getEstado(),
                    i.getDiagnosticoId(),
                    i.getEvaluacionId(),
                    i.getReparacionId(),
                    i.getFechaDiagnostico(),
                    i.getFechaEvaluacion(),
                    i.getFechaReparacion(),
                    i.getFechaCierre(),
                    i.getUsuarioCreacion(),
                    i.getFechaCreacion(),
                    i.getUsuarioModifica()
            );
            inputs.add(ticket);
        });
        return inputs;
    }

    @Override
    public TicketInput getById(Long id) {
        Optional<Ticket> ticketData = ticketJpaRepository.getById(id);
        if (ticketData.isPresent()){
            Ticket ticket = ticketData.get();
            TicketInput input = new TicketInput(
                    ticket.getId(),
                    ticket.getActivoId(),
                    ticket.getEstado(),
                    ticket.getDiagnosticoId(),
                    ticket.getEvaluacionId(),
                    ticket.getReparacionId(),
                    ticket.getFechaDiagnostico(),
                    ticket.getFechaEvaluacion(),
                    ticket.getFechaReparacion(),
                    ticket.getFechaCierre(),
                    ticket.getUsuarioCreacion(),
                    ticket.getFechaCreacion(),
                    ticket.getUsuarioModifica()
            );
            return input;
        }
        return null;
    }
}
