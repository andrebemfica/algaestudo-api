package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.listener;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerEmissaoNf {

    @EventListener
    public void clienteAtivadoListener(EventCliente cliente) {
        System.out.println("Emitindo nota fiscal para cliente: " + cliente.getNome());
    }
}
