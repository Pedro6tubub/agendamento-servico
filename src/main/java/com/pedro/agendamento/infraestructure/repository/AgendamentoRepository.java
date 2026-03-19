package com.pedro.agendamento.infraestructure.repository;

import com.pedro.agendamento.infraestructure.entity.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository <AgendamentoEntity, Long> {
}
