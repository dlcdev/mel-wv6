package com.teste.validacao.calculadora;

import com.teste.validacao.util.CalculadoraCreate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = CalculadoraCreate.create();
    }

    @Test
    @DisplayName("Valida parâmetros diferentes de zero")
    void dividir_ReturnValorDouble_WheParamDifferentZero() {
//        double a = 4;
//        double b = 2;
        double expected = CalculadoraCreate.create().getN1() / CalculadoraCreate.create().getN2();

        double resultado = calculadora.dividir();

        Assertions.assertEquals(expected, resultado);
    }

    @Test
    @DisplayName("Valida parâmetros com denominador zero")
    void dividir_ReturnValorDouble_WheParamEqualZero() {
//        double a = 4;
//        double b = 0;
        double expected = 0;
        calculadora.setN1(0);

        double resultado = calculadora.dividir();

        Assertions.assertEquals(expected, resultado);
    }



}