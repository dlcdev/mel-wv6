package com.dh.meli.funcionario.service;

import com.dh.meli.funcionario.model.Funcionario;
import com.dh.meli.funcionario.repository.FuncionarioRepo;

import java.util.List;

public interface IFuncionarioService {

    Funcionario saveNewEmployee(Funcionario newFuncionario);

    Funcionario updateEmployee(Funcionario funcionario);
    List<Funcionario> getAllEmployee();

    Funcionario getEmployeeById(int id);

    String deleteEmployeeById(int id);

}
