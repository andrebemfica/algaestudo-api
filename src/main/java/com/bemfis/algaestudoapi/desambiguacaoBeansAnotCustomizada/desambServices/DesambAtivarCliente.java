package com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.anotacoes.DesambTipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambModels.DesambCliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.enuns.DesambNivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.interfaces.DesambNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DesambAtivarCliente {
    @DesambTipoNotificador(DesambNivelUrgencia.SEM_URGENCIA)
    @Autowired
    DesambNotificador desambNotificador;
    public void ativar(DesambCliente desambCliente){
        desambCliente.ativar();
        desambNotificador.notificar(desambCliente, "Seu cadastro no sistema está ativo!");
    }
}
