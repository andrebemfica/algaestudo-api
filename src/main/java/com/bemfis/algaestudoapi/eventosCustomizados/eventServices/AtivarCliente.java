package com.bemfis.algaestudoapi.eventosCustomizados.eventServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambModels.DesambCliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.interfaces.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivarCliente {
    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    Notificador notificador;
    public void ativar(DesambCliente desambCliente){
        desambCliente.ativar();
        notificador.notificar(desambCliente, "Seu cadastro no sistema está ativo!");
    }
}
