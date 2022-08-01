package com.dh.meli.funcionario.service;

import com.dh.meli.funcionario.model.Funcionario;
import com.dh.meli.funcionario.repository.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService implements IFuncionarioService {

    @Autowired
    private FuncionarioRepo repo;

    @Override
    public Funcionario saveNewEmployee(Funcionario newFuncionario) {
        return repo.save(newFuncionario);
    }

    @Override
    public Funcionario updateEmployee(Funcionario funcionario) {
        return repo.save(funcionario);
    }

    @Override
    public List<Funcionario> getAllEmployee() {
        return repo.findAllFuncionario();
    }

    @Override
    public Funcionario getEmployeeById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public String deleteEmployeeById(int id) {
        repo.deleteById(id);
        return String.format("Deleted with success to id: %d", id);
    }
}
