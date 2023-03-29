package com.bemfis.algaestudoapi.profilesPostConstPreDestr.sms;

import com.bemfis.algaestudoapi.profilesPostConstPreDestr.notificador.Notificador;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Profile("dev")
@Component
public class Sms implements Notificador {
    @Override
    public String notificador(){
        return "mensagem enviada por SMS";
    }

}
