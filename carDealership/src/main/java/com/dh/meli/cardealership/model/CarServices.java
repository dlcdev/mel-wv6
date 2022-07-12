package com.dh.meli.cardealership.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarServices {
    private String date;
    private Integer kilometers;
    private String descriptions;
}
