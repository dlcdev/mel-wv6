package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank(message = "O nome do aluno não pode ficar vazio")
    @Pattern(regexp="([A-Z]|[0-9])[\\s|[0-9]|A-Z|a-z|ñ|ó|í|á|é|ú|Á|Ó|É|Í|Ú]*$", message = "O nome do aluno deve começar com letra maiúscula.")
    @Max(value = 50, message = "O comprimento do nome não pode exceder 50 carateres")
    String studentName;
    String message;
    Double averageScore;

    @NotEmpty(message = "A lista de assuntos não pode ficar vazia.")
    List<SubjectDTO> subjects;
}
