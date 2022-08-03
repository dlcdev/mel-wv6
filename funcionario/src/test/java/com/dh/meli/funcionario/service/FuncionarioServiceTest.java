package com.dh.meli.funcionario.service;

import com.dh.meli.funcionario.exception.InvalidEmployeeParam;
import com.dh.meli.funcionario.model.Funcionario;
import com.dh.meli.funcionario.repository.FuncionarioRepo;
import com.dh.meli.funcionario.util.GenerateEmployee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class FuncionarioServiceTest {

    @InjectMocks
    FuncionarioService funcionarioService;

    @Mock
    FuncionarioRepo funcionarioRepo;


    @Test
    void saveNewEmployee_whenValidEmployee() {

        BDDMockito.when(funcionarioRepo.save(ArgumentMatchers.any(Funcionario.class)))
                .thenReturn(GenerateEmployee.validEmployee1toSave());

        Funcionario funcionario = GenerateEmployee.newEmployee1toSave();

        Funcionario funcionarioSaved = funcionarioService.saveNewEmployee(funcionario);

        assertThat(funcionarioSaved).isNotNull();
        assertThat(funcionarioSaved.getId()).isPositive();
        assertThat(funcionarioSaved.getName()).isEqualTo(funcionario.getName());
        verify(funcionarioRepo, Mockito.times(1)).save(funcionario);

    }

    @Test
    void updateEmployee_whenFuncionarioIsValid() {

        BDDMockito.when(funcionarioRepo.save(ArgumentMatchers.any(Funcionario.class)))
                .thenReturn(GenerateEmployee.validEmployeeToUpdate());

        Funcionario funcionario1 =  GenerateEmployee.validEmployee3toSave();
        Funcionario updateFuncionario1 = GenerateEmployee.validEmployee3toSave();

        updateFuncionario1.setName("New name");
        Funcionario response = funcionarioService.updateEmployee(updateFuncionario1);
        System.out.println(response);

        assertThat(updateFuncionario1).isNotNull();
        assertThat(updateFuncionario1.getId()).isEqualTo(response.getId());
        assertThat(updateFuncionario1.getName()).isEqualTo(response.getName());


    }

    @Test
    void save_throwException_whenFuncionarioHasId() {
        Funcionario funcionario = GenerateEmployee.validEmployee1toSave();

        assertThrows(InvalidEmployeeParam.class, () ->{
            funcionarioService.saveNewEmployee(funcionario);
        } );

        verify(funcionarioRepo, Mockito.never()).save(funcionario);
    }


    @Test
    void getAllEmployee() {
    }

    @Test
    void getEmployeeById() {
    }

    @Test
    void deleteEmployeeById() {
    }
}