package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class SubjectDTO {

    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "([A-Z]|[0-9])[\\s|[0-9]|A-Z|a-z|ñ|ó|í|á|é|ú|Á|Ó|É|Í|Ú]*$", message = "O nome do aluno deve começar com letra maiúscula.")
    @Max(value = 30, message = "O comprimento do nome não pode exceder 50 carateres")

    String name;

    @NotBlank(message = "A nota não pode estar vazia.")
    @Min(value = 0, message = "A nota mínima é 0.0")
    @Max(value = 10, message = "A nota máxima é 10.0")
    Double score;

}
