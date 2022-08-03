package com.dh.meli.funcionario.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "meli_doc_employee")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id
    @Field(type = FieldType.Auto)
    private int id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "age", type = FieldType.Integer)
    private int age;

    @Field(name = "profession", type = FieldType.Text)
    private String profession;

    @Field(name = "salary", type = FieldType.Double)
    private double salary;
}
