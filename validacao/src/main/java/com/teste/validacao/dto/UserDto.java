package com.teste.validacao.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    @NotBlank(message = "O nome é um campo obrigatorio.")
    private String name;

    @NotBlank(message = "O e-mail é obritatorio")
    @Email(message = "O e-email deve ser valido")
    private String email;

    @Min(value = 18, message = "A idade minima é 18 anos")
    private int idade;
}
