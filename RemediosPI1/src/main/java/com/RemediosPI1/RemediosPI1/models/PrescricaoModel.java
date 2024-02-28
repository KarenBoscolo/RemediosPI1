package com.RemediosPI1.RemediosPI1.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prescricao_tb")
public class PrescricaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteModel paciente;

    @ManyToMany
    @JoinColumn(name = "medicamento_id")
    private MedicamentoModel medicamento;
}
