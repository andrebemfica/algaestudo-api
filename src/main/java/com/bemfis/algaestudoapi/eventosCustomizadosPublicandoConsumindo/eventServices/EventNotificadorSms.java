package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.anotacoes.EventTipoNotificador;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.enuns.EventNivelUrgencia;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.interfaces.EventNotificador;
import org.springframework.stereotype.Component;

@EventTipoNotificador(EventNivelUrgencia.SEM_URGENCIA)
@Component
public class EventNotificadorSms implements EventNotificador {
    public void notificar(EventCliente eventClient, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s",
                eventClient.getNome(), eventClient.getTelefone(), mensagem);
    }
}
