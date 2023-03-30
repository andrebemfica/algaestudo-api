package com.bemfis.algaestudoapi.eventosCustomizados.eventCtrl;

import com.bemfis.algaestudoapi.eventosCustomizados.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.EventAtivarCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventCtrl {
    @Autowired
    private EventAtivarCliente eventAtivarCliente;
    @GetMapping("/teste-event")
    @ResponseBody
    public String teste(){
        EventCliente bemfica = new EventCliente("André", "acb@gmail.com", "980690022");
        eventAtivarCliente.ativar(bemfica);
        return "Teste eventos customizados ok!";
    }
}
