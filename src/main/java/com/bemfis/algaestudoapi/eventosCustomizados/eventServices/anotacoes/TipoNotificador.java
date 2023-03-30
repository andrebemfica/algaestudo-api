package com.bemfis.algaestudoapi.eventosCustomizados.eventServices.anotacoes;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.enuns.NivelUrgencia;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoNotificador {
    NivelUrgencia value();
}