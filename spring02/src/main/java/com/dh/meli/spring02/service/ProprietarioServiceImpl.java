package com.dh.meli.spring02.service;

import com.dh.meli.spring02.model.Proprietario;
import com.dh.meli.spring02.model.Veiculo;
import com.dh.meli.spring02.repository.ProprietarioRepo;
import com.dh.meli.spring02.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProprietarioServiceImpl implements ProprietarioService{

    @Autowired
    private ProprietarioRepo proprietarioRepo;

    @Autowired
    private VeiculoRepo veiculoRepo;

    @Override
    public List<Proprietario> getAllProprietario() {
        List<Veiculo> listaVeiculos = veiculoRepo.getAllVeiculo();
        List<Proprietario> listaProprietario = proprietarioRepo.getAllVeiculo();

        //Composição
        listaProprietario.stream()
                .forEach(proprietario -> listaVeiculos.forEach(veiculo -> {
                    if(veiculo.getId_proprietario() == proprietario.getId()) {
                        proprietario.getVeiculos().add(veiculo);
                    }
                }));
        return listaProprietario;
    }
}
