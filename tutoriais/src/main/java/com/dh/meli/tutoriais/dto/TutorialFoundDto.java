package com.dh.meli.tutoriais.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TutorialFoundDto {
    List<TutorialDto> tutorials;
    private int found;
}
