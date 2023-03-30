package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventModels.Cliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.interfaces.Notificador;
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
