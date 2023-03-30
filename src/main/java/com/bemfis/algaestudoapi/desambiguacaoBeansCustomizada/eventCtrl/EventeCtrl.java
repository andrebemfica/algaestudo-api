package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventCtrl;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventModels.Cliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.AtivarCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventeCtrl {
    @Autowired
    private AtivarCliente ativarCliente;
    @GetMapping("/teste")
    @ResponseBody
    public String teste(){
        Cliente bemfica = new Cliente("André", "acb@gmail.com", "980690022");
        ativarCliente.ativar(bemfica);
        return "Teste ok!";
    }
}
