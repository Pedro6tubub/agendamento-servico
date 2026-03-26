package com.pedro.agendamento.services;
import com.pedro.agendamento.infraestructure.entity.AgendamentoEntity;
import com.pedro.agendamento.infraestructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoEntity salvarAgendamento (AgendamentoEntity agendamento){

        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horaFim = agendamento.getDataHoraAgendamento().plusHours(1);

        AgendamentoEntity agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(agendamento.getServico(),
                horaAgendamento, horaFim);

        if (Objects.nonNull(agendados)){
            throw new RuntimeException("Horario ja esta marcado");
        }
        return agendamentoRepository.save(agendamento);

    }
}
