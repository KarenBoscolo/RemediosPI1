package com.RemediosPI1.RemediosPI1.repositories;

import com.RemediosPI1.RemediosPI1.models.MedicamentoModel;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoModel, Long> {

    @Query
    List<MedicamentoModel> findByFormulaAndQuantidadeGreaterThanOrderByVencimentoAsc(String formula, int quantidade);
}

