package com.dh.meli.spring02.dto;

import com.dh.meli.spring02.model.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DTO = Data Transfer Object
@Getter
@Setter
@NoArgsConstructor
public class VeiculoDto {
    private String placa;
    private String modelo;
    private double valor;

    public VeiculoDto(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
        this.modelo = veiculo.getModelo();
        this.valor = veiculo.getValor();
    }
}
