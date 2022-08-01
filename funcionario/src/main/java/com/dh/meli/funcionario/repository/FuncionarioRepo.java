package com.dh.meli.funcionario.repository;

import com.dh.meli.funcionario.model.Funcionario;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepo extends ElasticsearchRepository<Funcionario, Integer> {

    @Query("{\"match_all\": {} }")
    List<Funcionario> findAllFuncionario();
}
