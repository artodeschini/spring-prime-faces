package org.todeschini.contas.servico;

import org.todeschini.contas.model.Conta;

import java.util.List;
import java.util.Optional;

public interface IContaService {

    List<Conta> findAll();

    Optional<Conta> findById(Integer id);

    Conta saveConta(Conta c);

    void deleteById(Integer id);
}
