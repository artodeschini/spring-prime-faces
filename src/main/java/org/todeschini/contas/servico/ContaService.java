package org.todeschini.contas.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todeschini.contas.model.Conta;
import org.todeschini.contas.repository.ContaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService implements IContaService {

    @Autowired
    private ContaRepository repository;

    @Override
    public List<Conta> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Conta> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Conta saveConta(Conta c) {
        return repository.save(c);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
