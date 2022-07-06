package com.dh.meli.spring02.repository;

import com.dh.meli.spring02.exception.NotFoundException;
import com.dh.meli.spring02.model.Proprietario;
import com.dh.meli.spring02.model.Veiculo;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProprietarioRepo {
    private final String linkFile = "src/main/resources/proprietario.json";

    public List<Proprietario> getAllVeiculo() {
        ObjectMapper mapper = new ObjectMapper();
        List<Proprietario> lista = null;
        try {
            lista = Arrays.asList(mapper.readValue(new File(linkFile), Proprietario[].class));
        } catch (Exception ex) {
            System.out.println("Erro" + linkFile);

        }
        return lista;

    }


}
