package com.bemfis.algaestudoapi.eventPublisherListener.eventServices;

import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.eventPublisherListener.eventModels.Cliente;
import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.interfaces.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivarCliente {
    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    Notificador notificador;
    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
