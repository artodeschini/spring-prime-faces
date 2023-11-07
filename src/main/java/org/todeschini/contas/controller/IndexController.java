package org.todeschini.contas.controller;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.todeschini.contas.model.Conta;
import org.todeschini.contas.servico.IContaService;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@ViewScoped
public class IndexController {

    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IContaService service;

    @Getter
    @Setter
    private List<Conta> contas;

    @Getter
    @Setter
    private Conta contaSelecionada;

    @PostConstruct
    public void init() {
        LOGGER.info("call init method");
        carregarDados();
    }

    private void carregarDados() {
        this.contas = service.findAll();
        //this.contas.forEach(System.out::println);
    }

    public void adicionarConta() {
        this.contaSelecionada = new Conta();
    }

    public void salvarConta() {
        if (this.contaSelecionada.getId() == null) {
            service.saveConta(this.contaSelecionada);
            this.carregarDados();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Conta Adicionada"));
        }

        // fecha a modal
        PrimeFaces.current().executeInitScript("PF('newContaModal').hide()");

        // atualuza a tabela
        PrimeFaces.current().ajax().update("form-conta:mensagens", "form-conta:tabela-contas");
    }

    public void deletar() {

    }
}
