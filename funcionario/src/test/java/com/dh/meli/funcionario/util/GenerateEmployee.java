package com.dh.meli.funcionario.util;

import com.dh.meli.funcionario.model.Funcionario;

public class GenerateEmployee {

    public static Funcionario newEmployee1toSave() {
        return Funcionario.builder()
                .name("Paulo")
                .age(22)
                .profession("Analisty ID")
                .salary(5000.0)
                .build();
    }

    public static Funcionario newEmployee2toSave() {
        return Funcionario.builder()
                .name("Andre")
                .age(32)
                .profession("System Analisty IT")
                .salary(15000.0)
                .build();
    }

    public static Funcionario newEmployee3toSave() {
        return Funcionario.builder()
                .name("EUEU")
                .age(39)
                .profession("Analisty Junior IT - Java")
                .salary(8250.0)
                .build();
    }

    public static Funcionario validEmployee1toSave() {
        return Funcionario.builder()
                .id(1)
                .name("Paulo")
                .age(22)
                .profession("Analisty ID")
                .salary(5000.0)
                .build();
    }

    public static Funcionario validEmployee2toSave() {
        return Funcionario.builder()
                .id(2)
                .name("Andre")
                .age(32)
                .profession("System Analisty IT")
                .salary(15000.0)
                .build();
    }

    public static Funcionario validEmployee3toSave() {
        return Funcionario.builder()
                .id(3)
                .name("EUEU")
                .age(39)
                .profession("Analisty Junior IT - Java")
                .salary(8250.0)
                .build();
    }

    public static Funcionario validEmployeeToUpdate() {
        return Funcionario.builder()
                .id(3)
                .name("New name")
                .age(39)
                .profession("Analisty Junior IT - Java")
                .salary(8250.0)
                .build();
    }


}

