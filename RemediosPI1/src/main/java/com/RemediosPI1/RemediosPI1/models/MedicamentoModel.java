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
@Table(name = "medicamento_tb")
public class MedicamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String formula;
    private int quantidade;
    @Temporal(TemporalType.DATE)
    private LocalDate vencimento;
}
