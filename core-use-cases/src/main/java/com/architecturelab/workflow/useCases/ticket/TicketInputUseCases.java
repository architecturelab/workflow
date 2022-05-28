package com.architecturelab.workflow.useCases.ticket;


import com.architecturelab.workflow.core.domain.item.TicketInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketInputUseCases {

    public TicketInput create(TicketInput itemInput);

    public TicketInput update(TicketInput itemInput);

    public List<TicketInput> getAll();

    public TicketInput getById(Long id);

}
