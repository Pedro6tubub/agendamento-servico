package com.pedro.agendamento.infraestructure.repository;

import com.pedro.agendamento.infraestructure.entity.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository <AgendamentoEntity, Long> {

    AgendamentoEntity findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio,
                                                                 LocalDateTime dataHoraFinal);

}
