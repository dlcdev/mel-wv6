package dh.meli.relationships.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import dh.meli.relationships.model.Author;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class AuthorDto {
    private String name;
    @JsonProperty("Endereço")
    private AddressDto addressDTO;

    public AuthorDto(Author author){
        this.name = author.getName();
        this.addressDTO = new AddressDto(author.getAddress());

    }
}
