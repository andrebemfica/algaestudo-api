package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.anotacoes;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.enuns.DesambNivelUrgencia;
import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface DesambTipoNotificador {
    DesambNivelUrgencia value();
}
