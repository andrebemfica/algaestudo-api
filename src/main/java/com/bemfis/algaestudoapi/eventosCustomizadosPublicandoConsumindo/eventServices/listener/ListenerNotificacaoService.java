package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.listener;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.anotacoes.EventTipoNotificador;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.enuns.EventNivelUrgencia;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.interfaces.EventNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerNotificacaoService {
    @EventTipoNotificador(EventNivelUrgencia.URGENTE)
    @Autowired
    private EventNotificador eventNotificador;

    @EventListener
    public void clienteAtivadoListener(EventCliente cliente) {
        eventNotificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
