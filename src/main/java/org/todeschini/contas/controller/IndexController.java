package org.todeschini.contas.controller;

import jakarta.annotation.PostConstruct;
import jakarta.faces.annotation.View;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.todeschini.contas.model.Conta;
import org.todeschini.contas.servico.IContaService;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexController {

    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IContaService service;

    private List<Conta> contas;

    @PostConstruct
    public void init() {
        mock();
        carregarDados();
    }

    private void carregarDados() {
        this.contas = service.findAll();
    }

    private void mock() {
        for (int i = 0; i < 4; i++) {
            service.saveConta(Conta.builder().nome("n" + i).tipo("t" + i).saldo((double) i).build());
        }
    }

}
