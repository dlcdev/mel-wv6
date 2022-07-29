package com.dh.meli.tutoriais.dto;

import com.dh.meli.tutoriais.model.Tutorial;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TutorialDto {
    private String title;
    private String description;


}
