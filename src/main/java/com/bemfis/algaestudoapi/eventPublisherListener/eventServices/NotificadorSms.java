package com.bemfis.algaestudoapi.eventPublisherListener.eventServices;

import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.eventPublisherListener.eventModels.Cliente;
import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.interfaces.Notificador;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorSms implements Notificador {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
