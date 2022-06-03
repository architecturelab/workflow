package com.architecturelab.workflow.infra.kafka.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Message {

    private Long ticketId;
    private Long diagnosticId;
    private Date diagnosticDate;

}
