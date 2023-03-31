package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.listener;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.EventClienteAtivado;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerEmissaoNf {

    @EventListener
    public void clienteAtivadoListener(EventClienteAtivado evento) {
        System.out.println("Emitindo nota fiscal para cliente: " + evento.getEventCliente().getNome());
    }
}
