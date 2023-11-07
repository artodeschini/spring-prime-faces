package org.todeschini.contas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.todeschini.contas.model.Conta;
import org.todeschini.contas.servico.IContaService;

@SpringBootApplication
public class ContasApplication implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private IContaService service;

    public static void main(String[] args) {
        SpringApplication.run(ContasApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        this.mock();
    }

    private void mock() {
        for (int i = 1; i < 4; i++) {
            service.saveConta(Conta.builder().nome("n" + i).tipo("t" + i).saldo((double) i).build());
        }
    }
}
