package com.dh.meli.spring02.service;

import com.dh.meli.spring02.model.Proprietario;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProprietarioService {
    List<Proprietario> getAllProprietario();
}
