package org.todeschini.contas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.todeschini.contas.model.Conta;

public interface ContaRepository extends JpaRepository<Conta,Integer> {
}
