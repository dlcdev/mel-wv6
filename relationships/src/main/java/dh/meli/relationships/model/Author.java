package dh.meli.relationships.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "author", cascade = CascadeType.PERSIST)
    // author = name do campo na tabela Address que é usada como referencia
    @JsonIgnoreProperties("author") // ao prencher os dados do Address, não agrega os dados do author
    private Address address;

    @ManyToMany
    @JoinTable(name = "book_author" // nome da tabela de ligacao
            , joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            // atributo do author na tabela de ligação
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id")
            // atributo do livro na tabela de ligação
    )
    @JsonIgnoreProperties("authors")
    private Set<Book> books;
}
