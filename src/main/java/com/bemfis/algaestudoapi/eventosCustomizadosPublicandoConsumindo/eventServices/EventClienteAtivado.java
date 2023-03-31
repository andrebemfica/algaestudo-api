package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;

public class EventClienteAtivado {
    private EventCliente eventCliente;

    public EventClienteAtivado(EventCliente eventCliente) {
        this.eventCliente = eventCliente;
    }

    public EventCliente getEventCliente() {
        return eventCliente;
    }
}
