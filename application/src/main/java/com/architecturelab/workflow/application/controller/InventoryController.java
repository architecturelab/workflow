package com.architecturelab.workflow.application.controller;

import com.architecturelab.workflow.core.domain.item.TicketInput;
import com.architecturelab.workflow.useCases.ticket.TicketInputUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workflow")
public class InventoryController {

    @Autowired
    private TicketInputUseCases ticketInputUseCases;

    @GetMapping("/ticket/{id}")
    public ResponseEntity<TicketInput> getTicketById(@PathVariable Long id) {
        try {
            TicketInput ticketInput = ticketInputUseCases.getById(id);
            if (ticketInput != null) {
                return new ResponseEntity<>(ticketInput, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/ticket")
    public ResponseEntity<TicketInput> createTicket(@RequestBody TicketInput ticketInput) {
        try {
            TicketInput _ticketInput = ticketInputUseCases.create(ticketInput);
            return new ResponseEntity<>(_ticketInput, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/ticket")
    public ResponseEntity<TicketInput> updateTicket(@RequestBody TicketInput ticketInput) {
        try {
            TicketInput _ticketInput = ticketInputUseCases.update(ticketInput);
            if (_ticketInput !=null) {
                return new ResponseEntity<>(_ticketInput, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<TicketInput>> getAllTickets() {
        try {
            List<TicketInput> ticketInputs = ticketInputUseCases.getAll();
            if (ticketInputs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(ticketInputs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
