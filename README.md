# workflow

## API REST

### TICKET
- Crear
  - URL: POST- http://34.68.181.78/workflow/ticket
  - Ejemplo request:
    ```json
    { 
    "activoId": 19,
    "estado": "sfs",
    "diagnosticoId": 5665,
    "evaluacionId": 23,
    "reparacionId": 565,
    "fechaDiagnostico": "2025-04-02",
    "fechaEvaluacion": "2025-04-02",
    "fechaReparacion": "2025-04-02",
    "fechaCierre": "2025-04-02",
    "usuarioCreacion": "test",
    "fechaCreacion": "2025-03-30",
    "usuarioModifica": "test"
    }
- Actualizar
  - URL: PUT- http://34.68.181.78/workflow/ticket
  - Ejemplo request:
    ```json
    { 
    "ticketId": 1,
    "activoId": 19,
    "estado": "sfs",
    "diagnosticoId": 5665,
    "evaluacionId": 23,
    "reparacionId": 565,
    "fechaDiagnostico": "2025-04-02",
    "fechaEvaluacion": "2025-04-02",
    "fechaReparacion": "2025-04-02",
    "fechaCierre": "2025-04-02",
    "usuarioCreacion": "test",
    "fechaCreacion": "2025-03-30",
    "usuarioModifica": "test"
    }
- Listar todos
  - URL: GET- http://34.68.181.78/workflow/tickets
- Consultar por Id:
  - URL: GET- http://34.68.181.78/workflow/ticket/{id}
