package com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.interfaces;

import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambModels.DesambCliente;
import org.springframework.stereotype.Component;

@Component
public interface DesambNotificador {
    public void notificar (DesambCliente desambCliente, String mensagem);
}
