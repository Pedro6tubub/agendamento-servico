package com.pedro.agendamento.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "agendamento")
public class AgendamentoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String servico;

    private LocalDateTime dataHoraAgendamento;

    private String cliente;

    private String telefoneCliente;

    private String profissional;

}
